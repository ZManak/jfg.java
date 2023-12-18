/*Imagine you are working on a seat reservation system for a theater. Create a Java program that represents a seat map in a 5x5 matrix. Seats can be occupied (represented by "X") or empty (represented by "O")*/
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        String[][] seatMap = initializeSeatMap();
        printSeatMap(seatMap);
        inputSeatMap(seatMap);
    }
   private static String ANSI_RED = "\u001B[31m";
    private static String ANSI_RESET = "\u001B[0m";
    private static String[][] initializeSeatMap() {
        String[][] seatMap = new String[5][5];
        for(
        int i = 0;
        i<seatMap.length;i++)
        {
            for (int j = 0; j < seatMap[i].length; j++) {
                seatMap[i][j] = "O";
            }
        }
        return seatMap;
    }
    private static void inputSeatMap(String[][] seatMap) {
        do {
            try{
            int row;
            int column;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select row (from 1 to 5; 0 to exit): ");
            row = scanner.nextInt();
            System.out.println("Enter a column (from 1 to 5; 0 to exit): ");
            column = scanner.nextInt();
            if (row == 0 || column == 0) {
                break;
            }
            if (seatMap[row-1][column-1] == "X") {
                System.out.println("Seat already occupied");
            } else {
                seatMap[row-1][column-1] = "X";
            }
            printSeatMap(seatMap);
            } catch (InputMismatchException e) {
                System.out.println("Error: " + e.getMessage() + "\nPlease enter a valid number");
            }
        } while (true);
    }
    private static void printSeatMap(String[][] seatMap) {
        System.out.println("\nSeat Map: ");
        for(
        int i = 0;
        i<seatMap.length;i++)
        {
            for (int j = 0; j < seatMap[i].length; j++) {
                if (seatMap[i][j] == "X") {
                    System.out.print(ANSI_RED + seatMap[i][j] + ANSI_RESET + " ");
                } else {
                    System.out.print(seatMap[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("____________");
    }
}
