import java.util.*;
import java.io.*;

public class words{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File("SCRABBLE.txt"));
    
        //This example find all words that have at least two a's in a row
        //It also demonstrates file processing
        while(input.hasNextLine()){
            String word = input.nextLine();
        
            String re = ".*AA.*";
            
            if(word.matches(re)){
                System.out.println(word);
            }
        }
    }
    
}

    
