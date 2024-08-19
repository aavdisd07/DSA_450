package SortingAlgorithm;


public class CountingSortclear {

    static void counting(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int index = 0;
        for (int j = 0; j < count.length; j++) {
            while (count[j] > 0) {
                arr[index++] = j;
                count[j]--;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 8, 3, 5, 7, 3, 2, 7, 2};
        counting(arr);
    }
}
