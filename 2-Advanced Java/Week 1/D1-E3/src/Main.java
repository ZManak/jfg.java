import java.util.Scanner;

import models.Product;
import lambdas.AddItem;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'exit' to quit or press enter to continue");
        while (!scanner.nextLine().equals("exit")) {
            System.out.println("Enter product name: ");
            String name = scanner.nextLine();
            System.out.println("Enter product price: ");
            int price = scanner.nextInt();
            System.out.println("Enter product stock: ");
            int stock = scanner.nextInt();
            Product product = new Product(name, price, stock);
            Product[] products = new Product[0];
            AddItem addItem = new AddItem();
            products = addItem.addItem(products, product);
            System.out.println("Access product by index: ");
            int input = scanner.nextInt();
            try {
                System.out.println(products[input]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Enter a valid index or enter 'exit' to quit");
            }
        }
    }
}
