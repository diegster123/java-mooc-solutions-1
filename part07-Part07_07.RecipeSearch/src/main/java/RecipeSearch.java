
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipes> recipes = readRecordsFromFile(file);
        UserInterface ui = new UserInterface(recipes, scanner);

        ui.start();
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
