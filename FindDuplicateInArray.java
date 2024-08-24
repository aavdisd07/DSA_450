
public class FindDuplicateInArray {
    static void findDuplicate(int arr[]) {
        int slow = arr[0];
        int fast = arr[0];
        while (true) {
            slow = arr[slow];
            fast = arr[arr[fast]];
            if (fast == slow) {
                break;
            }
        }
        int s1 = arr[0];

        while (s1 != slow) {
            s1 = arr[s1];
            slow = arr[slow];
        }
        System.out.println("The Duplicate  Element in array is: " + slow);

    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 2, 2 };
        int arr2[] = { 1, 2, 5, 5, 3, 4 };
        int arr3[] = { 1,2,3,1};
        findDuplicate(arr1);
        findDuplicate(arr2);
        findDuplicate(arr3);

    }
}
