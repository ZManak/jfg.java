/*A recital only allows entry to those over 18 years of age. To do this, you need a program that, once a user enters their age, determines through a message on the screen whether or not the person can enter the event. The program must display (depending on each case) a message informing the situation.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You can enter the event");
        } else {
            System.out.println("You can't enter the event");
        }
    }
}
