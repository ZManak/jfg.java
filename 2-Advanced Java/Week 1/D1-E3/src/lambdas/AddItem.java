package lambdas;

import models.Product;
import lambdas.InterfaceFunction;

public class AddItem {
    public Product[] addItem(Product[] products, Product product) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[products.length] = product;
        return newProducts;
    }
}
