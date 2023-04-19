public class Selection_Sort {

    public static void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos] > arr[j] ) {
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp; 
        }
    }
    public static void Printarr( int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
        Printarr(arr);
    }
    
}
