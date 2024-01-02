import java.util.Arrays;
import java.util.Scanner;

import lambdas.InterfaceFunction;
import models.Product;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'exit' to quit or press enter to continue");
        Product[] products = {};
        while (!scanner.nextLine().equals("exit")) {
            System.out.println("Enter product name: ");
            String name = scanner.nextLine();
            System.out.println("Enter product price: ");
            int price = scanner.nextInt();
            System.out.println("Enter product stock: ");
            int stock = scanner.nextInt();
            Product product = new Product(name, price, stock);
            InterfaceFunction addItem = (Product[] products1, Product item) -> {
                Product[] newProducts = new Product[products1.length + 1];
                for (int i = 0; i < products1.length; i++) {
                    newProducts[i] = products1[i];
                }
                newProducts[products1.length] = item;
                return newProducts;
            };
            products = addItem.addItem(products, product);
            System.out.println("Access product by index: ");
            int input = scanner.nextInt();
            try {
                System.out.println(products[input-1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Enter a valid index or enter 'exit' to quit");
            }
        }
    }
}
