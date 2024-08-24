import java.util.HashSet;

public class Arr_Contains_Sum0 {
    public static void main(String[] args) {
        HashSet<Integer>ans=new HashSet<>();
      int arr[]={4,2,1,3,6,-6};
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(arr[i]==0 || ans.contains(sum)||sum==0){
            System.out.print("Sum 0 is available");
            return;
        }
        ans.add(sum);
      }
      System.out.println("Sum 0  is not available");

    }
}
