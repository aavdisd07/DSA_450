
import java.util.Arrays;

public class find3Numbers {
    public static void  main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
         
        Arrays.sort(arr);
      for(int s:arr){
        System.out.print(s+" ");
      }
      System.out.println();
       int x=61;
        for(int i=0;i<arr.length;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==x){
                    System.out.println(sum+" found at: "+ i+" "+left+" " +right);
                    return ;
                }
                else if(sum>x){
                    right--;
                }
                else{
                    left++;
                }
            }

        }
        System.out.println("Not found");



    }
  
    
}
