import java.util.Scanner;

public class Pally{
    
    public static void main(String[] args){
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter your palindrome-ish phrase with no spaces.");
        String myPhrase = keys.nextLine();
        int start = 0;
        int length = myPhrase.length()-1;
        
        boolean result = palindrome(myPhrase, length, start);
        System.out.println("Is it a palindrome? " + result);
    }
    
    public static boolean palindrome(String s, int n, int i){
        /*if (s.charAt(i) != s.charAt(n-1)){
            return false;
        }
        if (i >= (n-1)  ){
            return true;
        }
        else {
           return palindrome(s, n-1, i+1);
        }*/
        if(s.charAt(i) != s.charAt(n)){
            return false;
        }
        else{
            if(i<=n-1){
            return palindrome(s, n-1, i+1);
            
        }
        return true;
    }
    }
}

     
     
    
