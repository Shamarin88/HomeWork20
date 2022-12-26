import java.util.*;

public class Product {
    private String name;
    private boolean alreadyBought;

    private final Set<Product> productList = new HashSet<>();

    public Product(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку продукта полностью");
        }
    }

    public Set<Product> getProductList() {
        return productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isAlreadyBought() {
        return alreadyBought;
    }

    public void setAlreadyBought(boolean alreadyBought) {
        this.alreadyBought = alreadyBought;
    }

    public void addProduct(Set<Product> productList) {
        if (!productList.contains(this)) {
            productList.add(this);
            this.alreadyBought = true;
        } else {
            throw new UnsupportedOperationException("Продукт " + this.name + " уже куплен");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Продукт - " + getName() +
                "\nУже куплен? - " + isAlreadyBought() +
                "\n";
    }
}
