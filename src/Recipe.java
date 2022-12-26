import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String name;
    private boolean alreadyExist;

    public Recipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAlreadyExist() {
        return alreadyExist;
    }

    public void setAlreadyExist(boolean alreadyExist) {
        this.alreadyExist = alreadyExist;
    }
    public void addRecipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
            this.alreadyExist = true;
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " уже есть");
        }
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
