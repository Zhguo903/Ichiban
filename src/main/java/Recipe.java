import java.util.List;

public class Recipe {
    private String name;//菜谱名
    private List<Ingredient> ingredients;//菜谱包含的成分
    private String linkToRecipe;//菜谱链接

    public Recipe(String name, List<Ingredient> ingredients, String linkToRecipe) {
        this.name = name;
        this.ingredients = ingredients;
        this.linkToRecipe = linkToRecipe;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public String getLinkToRecipe() {
        return linkToRecipe;
    }
}
