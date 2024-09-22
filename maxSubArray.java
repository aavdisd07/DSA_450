
class maxSubArray {
// Kadanes's Algorithm -Maximaum contagious subArray Sum 

    static int answer(int arr[]) {
        int max_sum = 0;
        int curr_sum = 0;

        for (int j : arr) {
            curr_sum += j;
            if (curr_sum < 0) {
                curr_sum = 0;
            } else if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }

        return max_sum;
    }

    static int[] MinSubarrSum(int arr[], int k) {
        int temp[] = new int[k];
        int Minsum = Integer.MAX_VALUE;
        int CurrSum = 0;
        
        for (int i = 0; i < arr.length - k+1; i++) {
            CurrSum=0;
            for (int j = i; j < i + k; j++) {
                CurrSum += arr[j];

            }
            if (CurrSum < Minsum) {
                Minsum = CurrSum;
               int l=0;
            for (int p = i; p < i + k; p++) {
                   temp[l++]=arr[p];

                }
            }
            
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, -1, 7, 8};
        int arr2[] = {25,11,12,21,25,11};
        int arr3[]=new int[2];
        arr3=MinSubarrSum(arr2, 2);
        for(int i:arr3){
            System.out.print(i+" ");
        }
        // System.out.println(answer(arr));
    }
}
