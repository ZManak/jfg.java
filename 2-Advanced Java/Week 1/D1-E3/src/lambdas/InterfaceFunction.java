package lambdas;

import models.Product;

@FunctionalInterface
public interface InterfaceFunction {
        public Product[] addItem(Product[] products, Product product);
    }
