
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Recipes {

    private String recipe;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipes(String recipe, int cookingTime, ArrayList<String> ingredients) {
        this.recipe = recipe;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return this.recipe;
    }

    public int getCookingTime() {
        return this.cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String toString() {
        return this.recipe + "," + " cooking time: " + this.cookingTime;
    }
}
