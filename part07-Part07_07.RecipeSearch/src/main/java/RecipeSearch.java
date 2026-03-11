
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipes> recipes = readRecordsFromFile(file);
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
            if (command.equals("list")) {
                System.out.println(" ");
                System.out.println("Recipes: ");
                for (Recipes recipe : recipes) {
                    System.out.println(recipe);
                }
            }
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String search = scanner.nextLine();
                for (Recipes recipe : recipes) {
                    if (recipe.getRecipe().contains(search)) {
                        System.out.println(" ");
                        System.out.println("Recipes: ");
                        System.out.println(recipe);
                    }
                }

            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println(" ");
                System.out.println("Recipes: ");
                for (Recipes recipe : recipes) {
                    if (recipe.getCookingTime() <= time) {
                        System.out.println(recipe);
                    } else {
                        continue;
                    }
                }
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String find = scanner.nextLine();
                System.out.println(" ");
                System.out.println("Recipes: ");
                for (Recipes ingredient : recipes) {
                    if (ingredient.getIngredients().contains(find)) {
                        System.out.println(ingredient);
                    }
                }
            }
        }
    }

    private static ArrayList<Recipes> readRecordsFromFile(String file) {
        ArrayList<Recipes> recipes = new ArrayList<>();

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
                recipes.add(new Recipes(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

}
