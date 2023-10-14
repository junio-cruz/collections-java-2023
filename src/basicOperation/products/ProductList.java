package basicOperation.products;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductList {

    Set<Product> productList;
    public ProductList() {
        this.productList = new HashSet<Product>();
    }

    public void productRegister(int code, String name, double price, int quantity) {
        this.productList.add(new Product(code, name, price, quantity));
    }

    public Set<Product> displayProductsName() {
        Set<Product> productsName = new TreeSet<>(this.productList);
        return productsName;
    }
    public Set<Product> displayProductsPrice() {
        Set<Product> productsPrice = new TreeSet<>(new ComparatorByPrice());
        productsPrice.addAll(this.productList);
        return productsPrice;
    }
}
