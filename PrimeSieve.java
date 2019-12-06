import java.util.Arrays;

public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    
    public static void main(String[] args) {
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        
        //write and implement the sieve algorithm
        
        //print a list of prime numbers to the console
        
    }
    /*collectPrimes is its own method, using the info from changed universal 
     *sieve[] 
     *printPrimeFactors is then a second method, using info from collectPrimes
     */
}

       