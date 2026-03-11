
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UserInterface {

    private Scanner scanner;
    private ArrayList<Recipes> recipes;

    public UserInterface(Scanner scan) {
        this.recipes = new ArrayList<>();
        this.scanner = scan;
        readRecordsFromFile();
    }
    
    public void readRecordsFromFile() {
        System.out.println("File to read: ");
        String file = this.scanner.nextLine();

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                int cookingTime = Integer.valueOf(scan.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scan.hasNextLine()) {
                    String ingredient = scan.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                this.recipes.add(new Recipes(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void start() {
        System.out.println(" ");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println(" ");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }
           commandHandle(command);
        }
    }

    public void commandHandle(String command) {
        if (command.equals("list")) {
            listRecipes();
        }
        if (command.equals("find name")) {
            findByName();
        }
        if (command.equals("find cooking time")) {
            findCookingTime();
        }
        if (command.equals("find ingredient")) {
            findIngredient();
        }
    }

    public void listRecipes() {
        System.out.println(" ");
        System.out.println("Recipes: ");
        for (Recipes recipe : this.recipes) {
            System.out.println(recipe);
        }
    }

    public void findByName() {
        System.out.println("Searched word: ");
        String search = this.scanner.nextLine();
        for (Recipes recipe : this.recipes) {
            if (recipe.getRecipe().contains(search)) {
                System.out.println(" ");
                System.out.println("Recipes: ");
                System.out.println(recipe);
            }
        }
    }

    public void findCookingTime() {
        System.out.println("Max cooking time: ");
        int time = Integer.valueOf(this.scanner.nextLine());
        System.out.println(" ");
        System.out.println("Recipes: ");
        for (Recipes recipe : this.recipes) {
            if (recipe.getCookingTime() <= time) {
                System.out.println(recipe);
            } else {
                continue;
            }
        }
    }

    public void findIngredient() {
        System.out.println("Ingredient:");
        String find = this.scanner.nextLine();
        System.out.println(" ");
        System.out.println("Recipes: ");
        for (Recipes ingredient : this.recipes) {
            if (ingredient.getIngredients().contains(find)) {
                System.out.println(ingredient);
            }
        }
    }

}
