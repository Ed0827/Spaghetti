import java.util.ArrayList;
import java.util.List;

interface FoodRecipe {
    String getName();
    List<String> getIngredients();
}

class Spaghetti implements FoodRecipe {
    private List<String> ingredients;
    
    public Spaghetti() {
        ingredients = new ArrayList<>();
        ingredients.add("Pasta");
        ingredients.add("Tomato Sauce");
        ingredients.add("Meatballs");
        ingredients.add("Parmesan Cheese");
        ingredients.add("Parsley");
    }
    
    @Override
    public String getName() {
        return "Spaghetti";
    }
    
    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}

public class CalculatorFoodRecipe {
    public static void main(String[] args) {
        if (args.length > 0) {
            String dishName = args[0];
            FoodRecipe recipe = getRecipe(dishName);
            if (recipe != null) {
                System.out.println("Ingredients for " + recipe.getName() + ":");
                for (String ingredient : recipe.getIngredients()) {
                    System.out.println("- " + ingredient);
                }
            } else {
                System.out.println("Recipe for " + dishName + " not found.");
            }
        } else {
            System.out.println("Please specify a dish name.");
        }
    }

    private static FoodRecipe getRecipe(String name) {
        if (name.equalsIgnoreCase("spaghetti")) {
            return new Spaghetti();
        }
        return null;
    }
}
