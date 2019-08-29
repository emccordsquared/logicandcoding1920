import java.util.Scanner;  //used to get keyboard input

public class Branching {
    public static void main( String[] args ) {
        double x, y;
        String word1, word2;
        boolean p, q;
        //open a scanner for keyboard input from the user
        Scanner keys = new Scanner( System.in );

        //prompt user for input and receive it from the keyboard
        System.out.println("Enter any number:  ");
        //get the first number from the user
        x = keys.nextDouble();  //finds a floating-point value in the user-entered text
       
        System.out.println("\nEnter a second number:  ");
        //get the second number from the user
        y = keys.nextDouble();
        
        //get two words from the user
        keys.nextLine();  //clear the keyboard buffer
        System.out.println("\nEnter a word:  ");
        word1 = keys.nextLine();
        System.out.println("\nEnter a second word:  ");
        word2 = keys.nextLine();
        keys.close();  //close the scanner
        
        System.out.println("\n\n");

        p = x > y;
        q = x < y;
        if( p ) {  //using a boolean variable for the condition
            System.out.println(x + " is greater than " + y);
            System.out.println("because " + x + " > " + y + " is " + p);
        }
        else if( x < y ) {  //using a logical comparison directly
            System.out.println(x + " is less than " + y);
            System.out.println("because " + x + " < " + y + " is " + q);
        }
        else {  //executes only if neither of the previous conditions are true
            System.out.println(x + " is equal to " + y);
            System.out.println("because " + x + " > " + y + " is " + p + " AND " + x + " < " + y + " is " + q);
        }
        
        if( word1.equals(word2) )
            System.out.println("\n" + word1 + " and " + word2 + " are identical.");
        else
            System.out.println("\n" + word1 + " and " + word2 + " are different.");

    }  //end main
}  //end Branching
