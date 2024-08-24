
import java.util.HashSet;

public class Longest_consecutive_subsequence {
    public static void main(String[] args) {
        // int arr[]={2,6,1,9,4,5,3};
        int arr[]={1,9,3,10,4,20,2};
        HashSet<Integer> ans=new HashSet<>();
        for(int k:arr){
            ans.add(k);
        }

        int current=1,longest=1;
        for(int p:arr){
            if(ans.contains(p-1)){
                continue;
            }
            else{
                int a=p;
                while(ans.contains(a+1)){
                    current++;
                    a++;
                }
                longest=Math.max(current, longest);
                current=1;
            }
        }
        System.out.println(longest);
        
    }
}
