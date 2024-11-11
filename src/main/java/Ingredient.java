public class Ingredient {
    private String name;//成分名称
    private String category;//成分类型（肉、蔬菜、水果、海鲜...）

    public Ingredient(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
