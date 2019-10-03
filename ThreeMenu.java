import java.util.Scanner;

public class ThreeMenu
{
    public static void main(String[] args){
   
        int choice = 3;    
        System.out.println("Choose your destiny: 1, 2, or 3");   
        Scanner keys = new Scanner(System.in);
        choice = keys.nextInt();
        while (choice != 3){
            if (choice == 1){
             System.out.println("Feed me a number");
             int square = keys.nextInt();
             System.out.println("I squared it! "+(square * square));
             System.out.println("Choose your destiny: 1, 2, or 3");
             choice = keys.nextInt();
            }
            else  {
             System.out.println("Feed me a number");
             int cube = keys.nextInt();
             System.out.println("I cubed it! " +(cube * cube * cube)); 
             System.out.println("Choose your destiny: 1, 2, or 3");
             choice = keys.nextInt();
            }  
        }
        System.out.println("Success! You have escaped!");
        keys.close();
    }
}

    