
class Trapping_water {

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i]=Math.max(left[i - 1],arr[i]);
        
        }
        right[n - 1] = arr[n - 1];

        for (int j = n - 2; j >=0; j--) {
            right[j]=Math.max(right[j+1],arr[j]);
            
        }
        System.out.print("Right Array: ");
        for (int k : right) {
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.print("Left Array: ");

        for (int j : left) {
            System.out.print(j + " ");
        }
        System.out.println();
        int sum = 0;
        for (int k = 0; k < n; k++) {
            int min = Math.min(right[k], left[k]);
            sum += min - arr[k];
        
        }
        System.out.print("Answer is: ");
        System.out.println(sum);

    }
}
