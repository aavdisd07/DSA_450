package ArrayList;

import java.util.ArrayList;


public class PairSum {
    static ArrayList<ArrayList<Integer>> PairSum(ArrayList<Integer>list,int target) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer> sublist=new ArrayList<>();
        for(int i=0;i<list.size()-1;i++){
           if(list.contains(target-list.get(i))){
              sublist.add(i);
              sublist.add(list.indexOf(target-list.get(i)));
              ans.add(sublist);
              break;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);

        System.out.println(PairSum(list,12));
    }
}
