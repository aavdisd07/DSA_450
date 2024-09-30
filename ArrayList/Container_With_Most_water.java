package ArrayList;

import java.util.ArrayList;

public class Container_With_Most_water {
    static int MostWater(ArrayList<Integer> list) {
        int MaxWater = 0;
        int leftPointer = 0;
        int rightpointer = list.size() - 1;
        while (leftPointer < rightpointer) {
            // find area covered int both pointer
            int height = Math.min(list.get(leftPointer), list.get(rightpointer));
            int area = height * (rightpointer - leftPointer);
            // update max area
            MaxWater = Math.max(MaxWater, area);
            System.out.println(MaxWater);
            if(list.get(leftPointer)<list.get(rightpointer)){
                leftPointer++;
            }
            else{
                rightpointer--;
            }
        }

        return MaxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(5);
        System.out.println(MostWater(list));
    }
}
