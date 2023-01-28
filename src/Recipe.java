import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {

    private String name;
    private boolean alreadyExist;
    private Integer productCount;
    private final Map<String, Integer> recipeList = new HashMap();

    public Recipe(String name,Integer productCount) {
        this.name = name;
        this.productCount = productCount;
    }

    public String getName() {
        return name;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public Map<String, Integer> getRecipeList() {
        return recipeList;
    }

    public boolean isAlreadyExist() {
        return alreadyExist;
    }

    public void setAlreadyExist(boolean alreadyExist) {
        this.alreadyExist = alreadyExist;
    }
    public void addRecipeInSet(Map<String, Integer> recipeSet) {
        if (!recipeSet.containsKey(this)) {
            recipeSet.put(name, productCount);
            this.alreadyExist = true;
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " уже есть");
        }
    }

    public void totalCost() {
        int totalCost= 0;
        for (Map.Entry<String, Integer> entry : recipeList.entrySet()) {
            totalCost += recipeList.get(getName());
        }
        System.out.println(getName() + " " + "Стоимость всех коктелей = " + totalCost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт - " + getName() +
                "\nЕсть ли такой рецепт? - " + isAlreadyExist() +
                "\n";
    }
}
