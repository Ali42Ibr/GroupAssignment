//PriorityQueue and Arrays
import java.util.*;

//Find Kth Largest Element
public class FKL {
    
    public static int FindKthLargest(int[] array, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i: array){
            minHeap.add(i);
            if(minHeap.size() > k){
                //remove largest element when size is greater than k.
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }

    //test method
    public static boolean testFKL(int[] array, int k){
        boolean correctElement = true;
        Arrays.sort(array);
        //iterative approach to find kth largest element by sorting array.
        int n = array[array.length - k];
        int chosenElement = FindKthLargest(array, k);
        //if it equals the result of our method, return true.
        if(n == FindKthLargest(array,k)){
            correctElement = true;
        }
        else{
            correctElement = false;
        }
        return correctElement;
    }

    public  static void main(String[] args) {
        //test run
        int[] numbers = {3, 8, 6, 4, 1, 9};
        int element = FindKthLargest(numbers, 3);
        boolean isCorrect = testFKL(numbers, 3);
        System.out.println("The element is " + element + "\nElement printed is " + isCorrect);
        
    }
}
