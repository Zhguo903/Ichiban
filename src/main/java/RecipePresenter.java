import java.util.List;

public class RecipePresenter {
    public void presentRecipes(List<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            System.out.println("Recipe: " + recipe.getName());
            System.out.println("Link: " + recipe.getLinkToRecipe());
            System.out.println("Ingredients:");
            for (Ingredient ingredient : recipe.getIngredients()) {
                System.out.println("- " + ingredient.getName() + " (" + ingredient.getCategory() + ")");
            }
            System.out.println();
        }
    }
}
