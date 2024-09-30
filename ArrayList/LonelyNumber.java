
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

class LonelyNumber{
    static ArrayList<Integer> LonelyList(int []list){
        ArrayList<Integer> ans=new ArrayList<>();
        // Arrays.sort(list);
          HashMap<Integer,Integer>Map=new HashMap<>();
        for(int i=0;i<list.length;i++){
            Map.put(list[i],Map.getOrDefault(list[i],0)+1);
        }
      for(int i:Map.keySet()){
        if(!Map.containsKey(i-1)&&!Map.containsKey(i+1)&&Map.get(i)==1){
          ans.add(i);
        }
      }
        return ans;

    }
    public static void main(String []args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        int list2[]={1,3,5,3};
       System.out.println(LonelyList(list2));

    }
}