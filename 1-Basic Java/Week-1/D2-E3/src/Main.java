/*A meteorology website needs a program that, by entering the 7 maximum temperatures of the last week, calculates the average maximum temperature there was.
To do this, you must manage a vector where the corresponding maximum temperature for each day is stored in each position. Once the temperatures have been stored, you must calculate their average by running through the vector and displaying the result on the screen.*/
public class Main {
    public static void main(String[] args) {
        int[] temperatures = { 20, 21, 22, 23, 24, 25, 26 };
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        System.out.println("Average temperature: " + sum / temperatures.length);
    }
}
