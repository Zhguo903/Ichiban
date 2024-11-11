import java.util.List;

public class Main {
    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("Carrot", "veggie");
        Ingredient ingredient2 = new Ingredient("Chicken", "meat");

        RecipePresenter presenter = new RecipePresenter();

        RecipeInteractor interactor = new RecipeInteractor(presenter);

        RecipeController controller = new RecipeController(interactor);

        // 用户选择食材并选择模式（严格模式为true，宽松模式为false）
        List<Ingredient> selectedIngredients = List.of(ingredient1, ingredient2);
        boolean isStrictMode = true;

        controller.onGenerateRecipes(selectedIngredients, isStrictMode);
    }
}

