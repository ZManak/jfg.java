/*Create a program that asks the user to enter two integers on the keyboard and perform the following operations with them: addition, subtraction, multiplication, and division. Shows the results of each of the operations on the screen/console with a user-friendly message.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first int number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second int number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));
        try {
            System.out.println("Division: " + (firstNumber / secondNumber));
        } catch (Exception e) {
            throw new Exception("Division by zero is not allowed");
        }
        /*if secondNumber = 0 then Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Main.main(Main.java:14) - solved through try/catch */
    }
}
