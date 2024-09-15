import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        // ArrayList<new ArrayList<>()> ans=new ArrayList<>();
        ArrayList<Integer> subarray=new ArrayList<>();
        int subset=1<<arr.length;
        for(int i=0;i<=subset-1;i++){
            for(int j=0;j<arr.length;j++){
                  if(j==1<<j){
                    subarray.add(arr[j]);
                }
                // ans.add(subarray)
            }

        }
    }
}
