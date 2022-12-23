import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

public static void main(String[]args) {

    System.out.println("Задание 1");
    System.out.println();

    Set<Product> productList = new HashSet<>();

    Product bananas = new Product("Бананы", 40, 60);
    Product kiwi = new Product("Киви", 50, 70);
    Product orange = new Product("Апельсины", 60, 90);

    bananas.addProduct(productList);
    kiwi.addProduct(productList);
    orange.addProduct(productList);

    System.out.println(Arrays.toString(productList.toArray()));
    System.out.println();
    System.out.println("Задание 2");
    System.out.println();

    Set<Recipe> recipeList = new HashSet<>();

    Recipe bananasCocktail = new Recipe("Банановый коктель");
    Recipe kiwiCocktail = new Recipe("Киви коктель");
    Recipe orangeCocktail = new Recipe("Апельсиновый коктель");

    bananasCocktail.addRecipeInSet(recipeList);
    kiwiCocktail.addRecipeInSet(recipeList);
    orangeCocktail.addRecipeInSet(recipeList);

    System.out.println(Arrays.toString(recipeList.toArray()));
    System.out.println();
    System.out.println("Задание 3");
    System.out.println();

    Set<Integer> integerSet = new HashSet<>();
    for (int i = 0; i < 21; i++) {
        integerSet.add((int) (Math.random() * 1000) + 1);
    }
    integerSet.removeIf(integer -> integer % 2 != 0);
    System.out.println(integerSet);
    }
}