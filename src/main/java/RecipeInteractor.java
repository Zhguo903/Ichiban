import java.util.List;

public class RecipeInteractor {
    private RecipePresenter recipePresenter;

    public RecipeInteractor(RecipePresenter presenter) {
        this.recipePresenter = presenter;
    }

    public void generateRecipes(List<Ingredient> selectedIngredients, boolean isStrictMode) {
        // 这里应该调用RecipeRepository获取菜谱数据
        // 但我们可以暂时用一个简单的假数据来测试
        List<Recipe> recipes = List.of(new Recipe("Sample Recipe", selectedIngredients, "https://example.com"));

        // 调用Presenter来展示数据
        recipePresenter.presentRecipes(recipes);
    }
}
