import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    static List<int[]> Merge(int arr[][]){
     Arrays.sort(arr,Comparator.comparingInt(a->a[0]));    
     List<int []> ans=new ArrayList<>();
      ans.add(arr[0]);
     int index=0;
     for(int[] interval:arr){
        int startIndex=interval[0];
        int endIndex=interval[1];
        if(startIndex<=ans.get(index)[1]){
            if(endIndex>ans.get(index)[1]){
                ans.get(index)[1]=endIndex;
            }
        }
        else{

            ans.add(new int[]{startIndex,endIndex});
            index++;
        }
     }
     return ans;
    } 
        public static void main(String arg[]){
            int arr[][]={{1,5},{4,8},{12,56},{90,1000}};
            List<int []>k=Merge(arr);
            for(int []p:k){
                System.out.print(Arrays.toString(p));
            } 

        }
    
}
