

import java.util.Scanner;

public class REV_ARR {
    static int[] rev_arr(int []arr,int start,int end){
    //    int end=arr.length-1;
    //    int start=0;
    if (start >= end)
            return arr;
     
        int s=arr[end];
        arr[end]=arr[start];
        arr[start]=s;
        // start++;
        // end--;
        rev_arr(arr, start + 1, end - 1);
     
        return arr;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
  System.out.println("function call");
        arr=rev_arr(arr,0,arr.length-1);

        for(int j:arr){
            System.out.print(j+" ");
        }
       

    }


}
