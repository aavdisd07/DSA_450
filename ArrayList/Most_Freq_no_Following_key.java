
import java.util.ArrayList;
import java.util.HashMap;

class Most_Frequent_No_with_following_key{
    static int Method(ArrayList<Integer> arr,int key){
        HashMap<Integer,Integer>HMap=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==key){
                HMap.put(arr.get(i+1),HMap.getOrDefault(arr.get(i+1),0)+1);
            }
        }
        int freq=Integer.MIN_VALUE;
        int ans=-1;
       for(int i:HMap.keySet()){
        if (HMap.get(i) > freq) {  // Check if current frequency is greater than the previous maximum
            freq = HMap.get(i);    // Update the maximum frequency
            ans = i;               // Update the answer with the key having the highest frequency
        
        }
       }
        return ans;
    }
    public static void main(String [] args){
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(1);
    arr.add(100);
    arr.add(200);
    arr.add(1);
    arr.add(100);


    int key=1;
    System.out.println(Method(arr,key));
    }
}