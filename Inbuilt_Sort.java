import java.util.Arrays;
import java.util.Collections;
public class Inbuilt_Sort {
    
    public static void main(String args[]) {
        // int arr[] = {5,1,4,3,2};
        Integer arr[] = {5,1,4,3,2};
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        Arrays.sort(arr,0 , 4, Collections.reverseOrder());
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
