import java.util.Scanner;


public class MergePractice{
    
    public static void main(String[] args){
      Scanner keys = new Scanner(System.in);
      System.out.println("Enter the length of your array!");
      int n = keys.nextInt();
      int[] myArray = new int[n];
      System.out.println("Give the first entry of your array!");
      int m = keys.nextInt();
      myArray[0] = m;
      for (int i = 1; i < n; i++){
          System.out.println("Give the next entry!");
          int p = keys.nextInt();
          myArray[i] =p;
        }
      mergeSort(myArray);
      System.out.println("Here is your sorted array!: " + java.util.Arrays.toString(myArray));
        
            
    }
    
    public static void mergeSort(int[] arr){
        int[] temp = new int[arr.length];

        mergeSort(arr, temp, 0, arr.length-1);
    }
    public static void mergeSort(int[] arr, int[] temp, int left, int right){
        if(left<right){
            int mid = (left + right)/2;
            mergeSort(arr, temp, left, mid);
            mergeSort(arr, temp, mid + 1, right);
            combineArrays(arr, temp, left, mid + 1, right);
        }
    }
    
    public static void combineArrays(int[]arr, int[] temp, int leftIndex, int rightIndex, int rightEnd){
        int leftEnd = rightIndex -1;
        int index = leftIndex;
        int size = rightEnd - leftIndex + 1;
        
        while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
            if (arr[leftIndex] < arr[rightIndex]){
                temp[index] = arr[leftIndex];
                index++;
                leftIndex++;
            }
            else{
                temp[index] = arr[rightIndex];
                index++;
                rightIndex++;
            }
        }
        
        while (leftIndex <= leftEnd) {
            temp[index] = arr[leftIndex];
            index++;
            leftIndex++;
        }
        
        while (rightIndex <= rightEnd) {
            temp[index] = arr[rightIndex];
            index++;
            rightIndex++;
        }
        
        for (int loc = rightEnd; loc > rightEnd - size; loc--) {
            arr[loc] = temp[loc];
        }
    }
                
}