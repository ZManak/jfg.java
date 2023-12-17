/*Create a program that asks the user to enter two integers on the keyboard and perform the following operations with them: addition, subtraction, multiplication, and division. Shows the results of each of the operations on the screen/console with a user-friendly message.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first int number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second int number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        System.out.println("Division: " + (firstNumber / secondNumber));
    }
}
