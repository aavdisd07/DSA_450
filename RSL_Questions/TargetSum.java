package RSL_Questions;

import java.util.HashMap;

public class TargetSum {
    public static void findPair(int[] arr, int target) {
        HashMap<Integer, Integer> H = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (H.containsKey(complement)) {
                System.out.println("Element found " + complement + " " + arr[i]);
                return;
            }
            H.put(arr[i], i);
        }
        System.out.println("No pair");
        return;
    }

    public static void main(String[] args) {
        int[] array = { 7, 2, 5, 10, 11 };
        int targetSum = 27;
        findPair(array, targetSum);
    }
}
