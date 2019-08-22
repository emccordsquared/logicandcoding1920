
/**
 * Conditional_Explore.java
 * Code for students to begin investigating conditional operators and branching in Java.
 * Students will determine the Java implementation for less than, less than or equal, greater than,
 * greater than or equal, equal, not equal, and, or, and not, as well as conditional branching statements
 *
 * @author Roy Chancellor
 * @version 1.0 (2019-01-26)
 */

import java.util.Scanner;  // needed for Scanner to get user input

public class Conditional_Explore
{ 
    public static void main(String[] args)
    {
        //NEED TO ADD ADDITONAL STATEMENTS, THEN THE CONDITIONAL BRANCHING EaAMPLES
        
        double a, b, swap;  //double variables can store decimal values
        Scanner keys = new Scanner( System.in );  //open a scanner for keyboard input from the user
        
        //prompt user for input and receive it from the keyboard
        System.out.println("Enter any number (positve, negative, integer, or decimal):  ");
        //get the first number from the user in Java
        a = keys.nextDouble();  //parses user input and finds a floating point value in the user-entered teat
       
        System.out.println("\nEnter a second number (positve, negative, integer, or decimal):  ");
        //get the second number from the user in Java
        b = keys.nextDouble();
        keys.close();  //close the scanner
        
        System.out.println("\n\n");
        
        //print the results of several logical comparisons
        System.out.println("Results of logical comparisons");
        System.out.println(a + " > " + b + " \t---->\t" + (a > b));
        System.out.println(a + " < " + b + " \t---->\t" + (a < b));
        System.out.println(a + " >= " + b + " \t---->\t" + (a >= b));
        System.out.println(a + " <= " + b + " \t---->\t" + (a <= b));
        System.out.println(a + " = " + b + " \t---->\t" + (a == b));
        System.out.println(a + " not= " + b + " \t---->\t" + (a != b));
        
        if(a > b) {  //swap a and b so that a < b
            swap = a;
            a = b;
            b = swap;
        }
        
        //print the results of several compound logical statements
        System.out.println("\nResults of compound logical statements");
        System.out.println("\t\tx ---->\t" + (a-1) + "\t" + a + "\t" + (a+1) + "\t" + (b-1) + "\t" + b + "\t" + (b+1));
        //make a table of results for a < x < y and a <= x or x > b
        System.out.print(a + " < x <= " + b + "\t\t" + ((a-1) > a && (a-1) <= b) + "\t" + (a > a && a <= b) + "\t" + ((a+1) > a && (a+1) <= b));
        System.out.println("\t" + ((b-1) > a && (b-1) <= b) + "\t" + (b > a && b <= b) + "\t" + ((b+1) > a && (b+1) <= b));
        System.out.print("x <= " + a  + " or x > " + b + "\t" + ((a-1) <= a || (a-1) > b) + "\t" + (a <= a || a > b) + "\t" + ((a+1) <= a || (a+1) > b));
        System.out.println("\t" + ((b-1) <= a || (b-1) > b) + "\t" + (b <= a || b > b) + "\t" + ((b+1) <= a || (b+1) > b));
        
        //perform examples of conditional branching
        if(a > 0 && b > 0)
            System.out.println("\nEach of your numbers is positive.");
        else if(a < 0 && b < 0)
            System.out.println("\nEach of your numbers is negative.");
        else if((a < 0 && b > 0) || (a > 0 && b < 0)) {
            System.out.println("\nOne of your numbers is negative and the other is positive.");
            if(a < 0)
                System.out.println(a + " is the negative number.");
            else
                System.out.println(b + " is the negative number.");
        }
    }  //end of main
}  //end of Conditional_Explore