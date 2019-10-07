/**
 * A skeleton program that gives the syntax for getting user input from the keyboard.
 *
 * @Roy Chancellor
 * @2019-03-24
 */
import java.util.Scanner;  //gives your program access to the Scanner methods
public class IterationLab
{
    public static void main(String args[]) {
        Scanner keys = new Scanner(System.in);  //creates a Scanner for getting keyboard input
        int yourIntVar;
        
        yourIntVar = keys.nextInt();  //finds an integer in the user's keystrokes and stores it in yourIntVar
        //can also use .nextLong() to find a long integer in the user's keystrokes
        //.nextFloat() or .nextDouble() would look for floating-point (i.e. decimal) numbers in the keystrokes
        keys.close();  //close the scanner when you are done getting user input
        
        //the rest of your code that operates on the user's input
    }
}
