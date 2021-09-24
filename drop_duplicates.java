
// use hashset to remove duplicates from int[

    import java.util.HashSet;
    import java.util.Set;
    public class drop_duplicates {
        
        // create a hashset and then convert it to a list
    
        public static int[] drop_duplicates (int[] arr){
            int end = arr.length;
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < end; i++){
                set.add(arr[i]); 
            }
            
            int n = set.size();
            int[] arr2 = new int[n];
      
            int i = 0;
            for (Integer x : set)
                arr2[i++] = x;
            
            return arr2;
        }
          // test class check for repeated values 
        public static boolean test(int[] arr) {
            
               boolean duplicates = true;
    
               
               for (int j=0;j<arr.length;j++)
                 for (int k=j+1;k<arr.length;k++)
                   if (k!=j && arr[k] == arr[j])
                     duplicates=true;
                   else {
                       duplicates = false;
                   }
            return duplicates;
            
        }
    
        // main method 
        public static void main(String[] args) {
            
            int[] numbers = {3,5,7,8, 1, 9,1,9,9,9,9};
            
            int[] element = drop_duplicates(numbers);
            
            for(Integer x: element) System.out.print(x);
            // testing 
            System.out.println(test(element));
           
       }
        
        
    }
    