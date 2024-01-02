package lambdas;

import models.Product;

public interface InterfaceFunction {
    @FunctionalInterface
    public interface InterfaceFunctional {
        public int AddItem(Product[] products, Product product);
    }
}
