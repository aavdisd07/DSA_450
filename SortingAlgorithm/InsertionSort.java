package SortingAlgorithm;

public class InsertionSort {

    static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int prev = i - 1;
            int curr = arr[i];
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];

                prev--;
            }
            arr[prev + 1] = curr;

        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3};
        insertion(arr);
    }
}
