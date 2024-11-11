import java.util.List;

public class RecipeController {
    private RecipeInteractor recipeInteractor;

    public RecipeController(RecipeInteractor interactor) {
        this.recipeInteractor = interactor;
    }

    public void onGenerateRecipes(List<Ingredient> selectedIngredients, boolean isStrictMode) {
        recipeInteractor.generateRecipes(selectedIngredients, isStrictMode);
    }
}
