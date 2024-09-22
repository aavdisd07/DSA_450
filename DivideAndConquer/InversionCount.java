package DivideAndConquer;

public class InversionCount {

    static int merge(int arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        int count = 0;
        int temp[] = new int[ei - si + 1];
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
                // The onlybabove case make  sure that this in Inversion problrm rather than merge sort 

            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int p = si; p <= ei; p++) {
            arr[p] = temp[p - si];
        }

        return count;
    }

    static int MergeSort(int arr[], int si, int ei) {
        int count = 0;
        if (si < ei) {
            int mid = si + (ei - si) / 2;
            count += MergeSort(arr, si, mid);
            count += MergeSort(arr, mid + 1, ei);
            count += merge(arr, si, mid, ei);
        }
        return count;
    }

   
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2};
        System.out.println(MergeSort(arr, 0, arr.length - 1));
        // System.out.println(MajorityElement3(arr));
    }
}
