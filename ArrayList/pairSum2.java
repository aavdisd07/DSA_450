package ArrayList;

import java.util.ArrayList;

// pair sum 2 is the find target sum in rotated sorted array
public class pairSum2 {
    static boolean PairSum(ArrayList<Integer> list, int target) {
        int pivote = -1;
        int leftPointer=-1;
        int rightPointer=-1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivote = list.get(i);
                leftPointer = i + 1;
                rightPointer = i;
                break;
            }
        }

        while (leftPointer != rightPointer) {
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                System.out.println(pivote);
                return true;

            } else if (list.get(leftPointer) + list.get(rightPointer) < target) {
              leftPointer=(leftPointer+1)%list.size();
            }
            else{
                rightPointer=(list.size()+rightPointer-1)%list.size();
            }

        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(PairSum(list,16));

    }
}
