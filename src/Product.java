import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private int price;
    private int count;
    private boolean alreadyBought;

    public Product(String name, int price, int count) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Заполните карточку продукта полностью");
        }
        if (count > 0) {
            this.count = count;
        } else {
            throw new IllegalArgumentException("Заполните карточку продукта полностью");
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Заполните карточку продукта полностью");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
                "\nЦена - " + getPrice() +
                "\nВес - " + getPrice() +
                "\nУже куплен? - " + isAlreadyBought() +
                "\n";
    }
}
