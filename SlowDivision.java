
import java.util.Scanner;
public class SlowDivision
{
    public static void main ( String args[]) {
       
        System.out.println("divide a number by another");
        Scanner keys = new Scanner (System.in);
        System.out.println("enter numerator");
        int n = keys.nextInt();
        System.out.println();
        System.out.println("enter denominator");
        int d = keys.nextInt();
        int f=0; //counts how many times subtraction is performed
        while (n>=d) {
            n = n-d;
            f++;      
           
        }
         
         System.out.print(f+ " " + n + "/" + d);
       
    }
}

