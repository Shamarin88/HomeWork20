import java.util.Arrays;
import java.util.HashMap;
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
    System.out.println();
    System.out.println("Задание 3");
    System.out.println();

    int [][] mas = new int[15][3];
    for (int i = 0; i < mas.length; i++) {
        for (int h = 0; h < mas[i].length - 1; h++) {
            mas[i][h] = (int)(Math.random() * 8) + 2;
            if (h == mas[i].length - 1) {
                mas[i][h] = mas[i][h - 2] * mas[i][h - 1];
                for (int q = 0; q < 1; q++) {
                    if (mas[i][h] == mas[q][h]) {
                        if (mas[i][h - 1] == mas[q][h - 1] || mas[i][h - 2] == mas[q][h - 2]) --i;
                    }
                }
            }
        }
    }
    for (int i = 0; i < mas.length; i++) {
        System.out.println("Задание № " + (i + 1 + " Умножить "));
        for (int h = 0; h < mas[i].length; h++) {
            if (h == 0)
                System.out.println(mas[i][h] + " на ");
            if (h == 1)
                System.out.println(mas[i][h]);
        }
    }

    System.out.println("Задание 4");
    System.out.println();

    Passport passportOne = new Passport(345987, "Вовк","Дмитрий","Вадимович","02.11.1987");
    Passport passportTwo = new Passport(156097, "Кулага","Владислав","Александрович","22.08.1992");
    Passport passportThree = new Passport(874018, "Сытников","Никита","Александрович","13.09.1996");
    Passport passportFour = new Passport(671045, "Смирнов","Федор","Николаевич","06.09.1985");

    HashMap<Long, Passport> passportMap = new HashMap<>();

    passportMap.put(passportOne.getNumPassport(), passportOne);
    passportMap.put(passportTwo.getNumPassport(), passportTwo);
    passportMap.put(passportThree.getNumPassport(), passportThree);
    passportMap.put(passportFour.getNumPassport(), passportFour);
    System.out.println(passportMap);
    System.out.println();
    System.out.println(passportMap.get(345987));
    }
}