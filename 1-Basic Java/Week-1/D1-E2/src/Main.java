// Create a program that declares a variable for each of the following data types:
// int, double, boolean, and String. Assigns a value to each variable and displays its contents in the console.
public class Main {
    public static void main(String[] args) {
        int myInt = 1;
        double myDouble = 1.0;
        boolean myBoolean = true;
        String myString = "Hello World";

        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myBoolean: " + myBoolean);
        System.out.println("myString: " + myString);

      /*Now, assign values that do not correspond to the data type. In what situations does an error occur and in which does it not? Justify the reason for each case.
        myInt = 1.0; // error - incompatible types: possible lossy conversion from double to int
        myDouble = 1; // no error - int is converted to double
        myBoolean = 1; // error - incompatible types: int cannot be converted to boolean
        myString = 1; // error - incompatible types: int cannot be converted to String*/
    }
}
