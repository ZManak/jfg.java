import models.Product;
import exceptions.InvalidProductException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidProductException {
        //creamos un objeto de la clase Product

        try {
            Product product = new Product("Coca Cola", 10, -5);
            validateProduct(product);
            Product product2 = new Product("Coca Cola", -5, 15.5);
            validateProduct(product2);
            Product product3 = new Product("", 10, 15.5);
            validateProduct(product3);
            System.out.println("El producto es válido");
        } catch (InvalidProductException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void validateProduct(Product product) throws InvalidProductException {
        if (product.getName().length() < 3) {
            throw new InvalidProductException("El nombre del producto debe tener al menos 3 caracteres");
        }
        if (product.getQuantity() < 0) {
            throw new InvalidProductException("La cantidad del producto debe ser mayor a 0");
        }
        if (product.getPrice() < 0) {
            throw new InvalidProductException("El precio del producto debe ser mayor a 0");
        }
    }
}
