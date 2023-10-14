package basicOperation.products;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private int code;
    private String name;
    private double price;
    private int quantity;
    public Product(int code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getCode() == product.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String toString() {
        return "code " + this.code + " name " + this.name + " - " +
                "price " + this.price + " - " + "quantity " + this.quantity;
    }

    @Override
    public int compareTo(Product product) {
        return name.compareToIgnoreCase(product.getName());
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public int getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
}


class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product product, Product productToCompare) {
        return Double.compare(product.getPrice(), productToCompare.getPrice());
    }
}
