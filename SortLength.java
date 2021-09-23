import java.lang.reflect.Array;
import java.util.Arrays; 


public class SortLength {

  


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