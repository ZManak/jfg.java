package lambdas;

import models.Product;

public interface InterfaceFunction {
    @FunctionalInterface
    public interface InterfaceFunctional {
        public Product[] addItem(Product[] products, Product product);
    }
}
