package lambdas;

import models.Product;

public class AddItem {
    public Product[] addItem(Product[] products, Product product) {
        Product[] newProducts = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newProducts[i] = products[i];
        }
        newProducts[products.length] = product;
        return newProducts;
    }
}
