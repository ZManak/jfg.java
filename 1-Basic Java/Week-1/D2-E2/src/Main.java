import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the price of the items in the cart or 0 to stop:");

        ArrayList<Double> itemPrices = readItemPrices();
        if (itemPrices.isEmpty()) {
            System.out.println("The cart is empty");
        } else {
            double totalPrice = calculateTotalPrice(itemPrices);
            System.out.println("The total price of the items in the cart is: " + totalPrice);
        }
    }

    private static ArrayList<Double> readItemPrices() {
        ArrayList<Double> itemPrices = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                double price = scanner.nextDouble();
                if (price == 0) {
                    break;
                } else if (price < 0) {
                    System.out.println("Invalid input. Please enter a positive price or 0 to stop.");
                } else {
                    itemPrices.add(price);
                    System.out.println("Enter the price of the next item or 0 to stop:");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid price or 0 to stop.");
                scanner.next();
            }
        } while (true);

        scanner.close();
        return itemPrices;
    }

    private static double calculateTotalPrice(ArrayList<Double> itemPrices) {
        double totalPrice = 0;
        for (double price : itemPrices) {
            totalPrice += price;
        }
        return totalPrice;
    }
}
