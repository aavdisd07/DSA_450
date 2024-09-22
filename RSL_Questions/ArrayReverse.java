package RSL_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

// 1. Array Reverse Using an Extra Array (Non In-place):
// 2. Array Reverse Using a Loop (In-place):
// 3. Array Reverse Inbuilt Methods (Non In-place):
// 4. Array Reverse Recursion (In-place or Non In-place):
// 5. Array Reverse Stack (Non In-place):

public class ArrayReverse {
    static void first(int[] arr) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }

        for (int i : temp) {
            System.out.print(i + " ");
        }
        return;
    }

    static void Second(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        return;
    }

    static void third() {
        Integer[] originalArray = { 1, 2, 3, 4, 5 };
        Collections.reverse(Arrays.asList(originalArray));
        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
        return;
    }

    static void fifth(int arr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i : arr) {
            s.push(i);
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = s.pop();
        }
      
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        first(arr);
        System.out.println();
        Second(arr);
        System.out.println();
        third();
        System.out.println();
        fifth(arr);
        for(int k:arr){
            System.out.print(k+" ");
        }

    }
}
