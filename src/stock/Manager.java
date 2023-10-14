package stock;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<Long, Product> productsList;
    public Manager() {
        this.productsList = new HashMap<Long, Product>();
    }

    public void addProduct(long cod, String name, double price, int quantity) {
        this.productsList.put(cod, new Product(name, price, quantity));
    }

    public void displayProducts() {
        System.out.println(this.productsList);
    }

    public double calculateTotalValueOfStock() {
        double totalValueOfStock = 0d;
        if (!this.productsList.isEmpty()) {
            for (Product product: this.productsList.values()) {
                totalValueOfStock = totalValueOfStock + (product.getQuantity() * product.getPrice());
            }
        }
        return totalValueOfStock;
    }

    public Product getMoreExpansiveProduct() {
        Product moreExpansiveProduct = null;
        double highestValue = Double.MIN_VALUE;
        if (!this.productsList.isEmpty()) {
            for (Product product: this.productsList.values()) {
                if (product.getPrice() > highestValue) {
                    moreExpansiveProduct = product;
                }
            }
        }
        return moreExpansiveProduct;
    }
}
