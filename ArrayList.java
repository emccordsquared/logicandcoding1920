/**
 * The class ArrayList
 *
 * @author  Jake Tawney
 * @version 3/10/2019
 */

public class ArrayList{
    private int[] data;
    private int last; //index of the last element
    
    //set initial capacity to 10
    public ArrayList(){
        data = new int[10];
        last = ?;  //fix
    }

    //returns the number of elements in the list (not the capacity)
    public int size(){
        
    }



    //Precondition: 0 <= index <= last
    //return the element at that index
    public int get(int index){
        
    }



    //Precondition:  0 <= index <= last
    //sets the value at index to the newValue
    public void set(int index, int newValue){
        
    }



    //Precondition:  0 <= index <= last
    //value at index is removed from the list – all elements shift down
    //returns removed value
    public int remove(int index){
        
    }

    //Precondition:  0 <= index <= last+1
    //Inserts newValue at index.  Everything from index on gets shifted up
    public void add(int index, int newValue){
        
    }

    
    //adds newValue to the end of the list
    public void add(int newValue){
        
    }


    //private method means "not accessible outside the class"
    //This is intentional.
    //This method should double the capacity
    private void resize(){
        
    }


    //returns, for example, "[3, 6, 7, 9]"
    //This will be helpful for your debugging
    public String toString(){
        
    }


    //returns true if two lists have exactly the same elements
    //in exactly the same order
    public boolean equals(ArrayList otherList){
        
    }
}