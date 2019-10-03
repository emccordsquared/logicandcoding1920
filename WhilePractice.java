
import java.util.Scanner;
public class WhilePractice
{
    public static void main( String[] args) {
     /* //prob 1 is a BAD PROBLEM 
      int i = 0;
        double x = 0.0;
        while (i <10) {
            x += i % 2;
    
        }
        System.out.println("The value of x is " + x); 
        */
     
     
      /*//prob 2 
      int i = 0;
      while (i <= 15) {

          if (i % 2 ==0)
            System.out.println("quack");
          else if (i % 3 == 0)
            System.out.println("moo");
          else if (i % 5 == 0)
            System.out.println("oink");
          else
            System.out.println("woof");
            i++;
        } */
        
      /*// prob 3
      int value = 498703578;
      while (value != 0) {
          System.out.print(value % 10);
          value /= 10;
        } */
      /*//prob 5
        int numbah = 99;
        while (numbah > 0) {
            System.out.println(numbah);
            numbah = numbah - 2;
        }*/
       //prob 7
       String pwd = "pa55word";
        String guess = "1";
     
        Scanner keys = new Scanner(System.in);
        
        while(!guess.equals(pwd)) {
            System.out.println("type pa55word");
             guess = keys.nextLine();
             
        }
        
        System.out.println("You did it! you typed pa55word! Access granted.");
        keys.close();  
    }
}