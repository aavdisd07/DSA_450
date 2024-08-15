import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int arr1[]={1,45,3,22};
        int arr2[]={1,0,2,1246,7};

        int i=arr1.length-1;
        int j=0;
        while(j<arr2.length && i>=0){
            if(arr1[i]>arr2[j]){
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            i--;
            j++;
        }
        
        Arrays.sort(arr1);Arrays.sort(arr2);
        for(int k:arr1){
            System.out.print(k+" ");
        }
System.out.println();
        for(int t:arr2){
            System.out.print(t+" ");
        }
    }




}
