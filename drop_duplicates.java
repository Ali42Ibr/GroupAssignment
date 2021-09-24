import java.util.HashSet;
public class drop_duplicates {
    public static int[] dropd (int[] arr){
        int end = arr.length;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < end; i++){
            set.add(arr[i]);
        }
    }
       

}
    
    









