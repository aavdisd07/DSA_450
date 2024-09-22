package DivideAndConquer;

public class SIRSA {

    static int Search(int arr[], int si, int ei, int target) {
        // base case
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        // if line1
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, si, mid - 1, target);
            } else {
                return Search(arr, mid + 1, ei, target);
            }
        } else {
            // line2
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, mid + 1, ei, target);
            } else {
                return Search(arr, si, mid - 1, target);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 1, 2};
        int ans = Search(arr, 0, arr.length - 1, 0);
        System.out.println(ans);
    }
}
