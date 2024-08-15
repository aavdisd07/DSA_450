
import java.util.Arrays;

public class FindPeakElement {
    
    static int peakElement(int arr[], int n){
        
       Arrays.sort(arr);
       return arr[n-1];
    }
    public static void main(String[] args) {
        int arr[]={1, 1, 1, 2, 1, 1, 1};
        // int arr[]={1, 2, 3};
        System.out.println(peakElement(arr, arr.length));
    }

}
