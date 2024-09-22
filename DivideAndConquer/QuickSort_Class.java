package DivideAndConquer;

public class QuickSort_Class {

    static void QuickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivoteIndx = partition(arr, si, ei);
        QuickSort(arr, si, pivoteIndx - 1);
        QuickSort(arr, pivoteIndx + 1, ei);
    }

    static int partition(int arr[], int si, int ei) {
        int pivote = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivote;
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {3, 7, 1, 6, 9, 4, 3};
        QuickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
