import java.lang.reflect.Array;
import java.util.Arrays; 


public class SortAlpha {

  public static void main(String[] args) {
		String[] arr = {"Adam", "Darren", "Cole", "Georgia", "Bailey" };

    sort(arr);
  }

    

  public static String[] sort(String[] arr) {

    Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

    return arr;
  }


boolean isSorted(String[] arr) {

    for (int i = 0; i < arr.length-1; i++) {
        if(arr[i].compareTo(arr[i+1]) >0){
            return false;
        }
    }
    return true;
}

    
}
