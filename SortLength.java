import java.lang.reflect.Array;
import java.util.Arrays; 


public class SortLength {


  public static void main(String[] args){
    String[] arr = {"ali1111111111","ali","ali3"}; //sample array to be sorted by increasing string length
    String[] sortedArray = sort(arr);
    for (int i = 0; i < sortedArray.length; i++) //for loop to print the array  
    System.out.print( sortedArray[i]+ " ");     


    if (testSort(sortedArray) == true){
      System.out.print("\nArray is sorted");
    } else {
      System.out.print("Code has failed, array is not sorted");
    }

  }//End of main

  


  public static String[] sort(String[] arr) {
    // code to be executed

    for (int i = 0; i < arr.length; i++){
      for (int j = 1; j < arr.length-i; j++){
        if (arr[j-1].length() > arr[j].length()){
          String temp = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = temp;
        }
      }
    }



    return arr;
  }

  public static boolean testSort(String[] arr){
    boolean sorted = true;
    for (int i = 1; i < arr.length; i++){
      if (arr[i-1].length() > arr[i].length()){
        sorted = false;
      }
    }

    return sorted;
  }


}//End of FirstJavaProgram Class