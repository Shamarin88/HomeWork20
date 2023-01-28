import java.util.*;

public class Main {

public static void main(String[]args) {

    System.out.println("Задание 1");
    System.out.println();

    Product bananas = new Product("Бананы");
    Product kiwi = new Product("Киви");
    Product orange = new Product("Апельсины");

    bananas.addProduct(bananas.getProductList());
    kiwi.addProduct(kiwi.getProductList());
    orange.addProduct(orange.getProductList());

    System.out.println();
    System.out.println("Задание 2");
    System.out.println();

    Recipe bananasCocktail = new Recipe("Банановый коктель", 100);
    Recipe kiwiCocktail = new Recipe("Киви коктель",200);
    Recipe orangeCocktail = new Recipe("Апельсиновый коктель",50);

    bananasCocktail.addRecipeInSet(bananasCocktail.getRecipeList());
    kiwiCocktail.addRecipeInSet(kiwiCocktail.getRecipeList());
    orangeCocktail.addRecipeInSet(orangeCocktail.getRecipeList());

    bananasCocktail.totalCost();
    kiwiCocktail.totalCost();
    orangeCocktail.totalCost();

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