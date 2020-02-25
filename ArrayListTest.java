/**
 * The test class ArrayListTest.
 *
 * @author  Jake Tawney
 * @version 3/10/2019
 */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest
{
    @Test
    public void testConstructor()
    {
        // Setup
        final ArrayList myList = new ArrayList();
        
        // Method under test
        assertEquals(myList.size(), 0);
    }
    
    @Test
    public void testSize()
    {
        // Setup
        final ArrayList myList = new ArrayList();
        
        // Method under test
        assertEquals(myList.size(), 0);
        myList.add(3);
        assertEquals(myList.size(), 1);
        for(int i=1; i<=8; i++)
            myList.add(i+3);
        assertEquals(myList.size(), 9);
        myList.add(12);
        assertEquals(myList.size(), 10);
    }
    
    @Test
    public void testGet(){
        // Setup
        final ArrayList myList = new ArrayList();
        
        // Method under test
        for(int i=1; i<=8; i++)
            myList.add(2 * i);
        assertEquals(myList.get(0), 2);
        assertEquals(myList.get(3), 8);
        assertEquals(myList.get(7), 16);
        assertEquals(myList.size(), 8);
    }
    
    @Test
    public void testSet(){
        // Setup
        final ArrayList myList = new ArrayList();
        
        // Method under test
        for(int i=1; i<=8; i++)
            myList.add(2 * i);
        myList.set(0, -2);
        myList.set(3, -8);
        myList.set(7, -16);
        assertEquals(myList.get(0), -2);
        assertEquals(myList.get(3), -8);
        assertEquals(myList.get(7), -16);
        assertEquals(myList.size(), 8);
    }
    
    @Test
    public void testRemove(){
        // Setup
        final ArrayList myList = new ArrayList();
        final ArrayList ans1 = new ArrayList();
        final ArrayList ans2 = new ArrayList();
        final ArrayList ans3 = new ArrayList();
        
        // Method under test
        for(int i=1; i<=8; i++){
            myList.add(2 * i);
            if(i != 8) ans1.add(2 * i);
            if(i != 8 && i != 4) ans2.add(2 * i);
            if(i != 8 && i != 4 && i != 1) ans3.add(2 * i);
        }
             
        int rem = myList.remove(7);
        assertEquals(rem, 16);
        assertEquals(myList.size(), 7);
        assertEquals(myList.equals(ans1), true);
        
        rem = myList.remove(3);
        assertEquals(rem, 8);
        assertEquals(myList.size(), 6);
        assertEquals(myList.equals(ans2), true);
        
        rem = myList.remove(0);
        assertEquals(rem, 2);
        assertEquals(myList.size(), 5);
        assertEquals(myList.equals(ans3), true);
    }
    
    @Test
    public void testAdd(){
        // Setup
        final ArrayList myList = new ArrayList();
        final ArrayList ans1 = new ArrayList();
        final ArrayList ans2 = new ArrayList();
        final ArrayList ans3 = new ArrayList();
        final ArrayList ans4 = new ArrayList();
        
        // Method under test
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        
        ans1.add(1);
        ans1.add(2);
        ans1.add(3);
        ans1.add(4);
        ans1.add(5);
        
        ans2.add(1);
        ans2.add(2);
        ans2.add(-3);
        ans2.add(3);
        ans2.add(4);
        ans2.add(5);
        
        ans3.add(-1);
        ans3.add(1);
        ans3.add(2);
        ans3.add(-3);
        ans3.add(3);
        ans3.add(4);
        ans3.add(5);
        
        ans4.add(-1);
        ans4.add(1);
        ans4.add(2);
        ans4.add(-3);
        ans4.add(3);
        ans4.add(-4);
        ans4.add(4);
        ans4.add(5);
        
        myList.add(4, 5);
        assertEquals(myList.size(), 5);
        assertEquals(myList.equals(ans1), true);
        
        myList.add(2, -3);
        assertEquals(myList.size(), 6);
        assertEquals(myList.equals(ans2), true);
        
        myList.add(0, -1);
        assertEquals(myList.size(), 7);
        assertEquals(myList.equals(ans3), true);
        
        myList.add(5, -4);
        assertEquals(myList.size(), 8);
        assertEquals(myList.equals(ans4), true);
    }
    
    @Test
    public void testToString(){
        // Setup
        final ArrayList myList = new ArrayList();
        
        // Method under test
        assertEquals(myList.toString(), "[]");
        
        for(int i=1; i<=8; i++)
            myList.add(2 * i);
        String ans = "[2, 4, 6, 8, 10, 12, 14, 16]";
        
        assertEquals(myList.toString(), ans);
    }
    
    @Test
    public void testEquals(){
        // Setup
        final ArrayList myList = new ArrayList();
        final ArrayList mySecondList = new ArrayList();
        final ArrayList myThirdList = new ArrayList();
        final ArrayList myFourthList = new ArrayList();
        final ArrayList myEmptyList = new ArrayList();
        final ArrayList mySecondEmptyList = new ArrayList();
        
        // Method under test
        for(int i=1; i<=8; i++){
            myList.add(2 * i);
            mySecondList.add(2 * i);
            myThirdList.add(2 * i);
            if(i != 5) myFourthList.add(2 * i);
        }
        myThirdList.set(2, -7);
        
        assertEquals(myList.equals(mySecondList), true);
        assertEquals(myList.equals(myThirdList), false);
        assertEquals(myList.equals(myFourthList), false);
        assertEquals(myThirdList.equals(myFourthList), false);
        assertEquals(myEmptyList.equals(mySecondEmptyList), true);
        assertEquals(myList.equals(myEmptyList), false);
    }
    
    @Test
    public void testResize(){
        // Setup
        final ArrayList myList = new ArrayList();
        final ArrayList mySecondList = new ArrayList();
        
        // Method under test
        for(int i=1; i<=55; i++){
            myList.add(2 * i);
            if(i < 40) mySecondList.add(2 * i);
        }
        
        assertEquals(myList.size(), 55);
        
        for(int i=1; i<=55; i++){
            assertEquals(myList.get(i-1), 2 * i);
        }
        
        for(int i=40; i<=55; i++){
            myList.remove(i);
        } 
        assertEquals(myList.equals(mySecondList), true);   
    }
    
    @Test
    public void testEmptyTheList(){
        // Setup
        final ArrayList myList = new ArrayList();
        
        // Method under test
        for(int i=1; i<=55; i++){
            myList.add(2 * i);
        }
        
        for(int i=1; i<=55; i++){
            myList.remove(0);
        }
        
        assertEquals(myList.size(), 0);   
    }
}
