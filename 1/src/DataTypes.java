import java.util.Scanner;

/**
 * Solution to Day 1: Data Types HackerRank tutorial.
 * See <a href="https://www.hackerrank.com/challenges/30-data-types/problem">link</a>
 * @author devendiaz
 * @version 1.0
 */
public class DataTypes {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //Declare 3 variables i: int, d: double, s: String
        int i = 4;
        double d = 4.0;
        String s = "HackerRank";

        // Declare second integer, double, and String variables.
        int myInt;
        double myDouble;
        String myString;

        //Read lines from stdin and initialize 3 variables
        Scanner stdin = new Scanner(System.in);

        System.out.print("Enter an int: ");
        myInt = stdin.nextInt();

        System.out.print("Enter a double: ");
        myDouble = stdin.nextDouble();

        stdin.nextLine(); //Skip empty string line
        System.out.print("Enter a string: ");
        myString = stdin.nextLine();

        //Use the + operator to perform the following operations
        // Print the sum of both integer variables on a new line.
        System.out.printf("%d\n",i + myInt);
        // Print the sum of the double variables on a new line.
        System.out.printf("%.1f\n",d + myDouble);
        // Concatenate and print the String variables on a new line; the 's' variable above should be printed first.
        System.out.printf("%s\n",s + myString);

        stdin.close();
    }
}
