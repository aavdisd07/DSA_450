import java.util.Arrays;

class minheight{
    static int getMinDiff(int arr[],int k){
        int n=arr.length;
        int diff;
       Arrays.sort(arr);
        int max=arr[n-1];
        int min=arr[0];
        diff=max-min;
        for(int i=1;i<n;i++){
          if(arr[i]-k<0){
            continue;
          }
          min=Math.min(arr[0]+k,arr[i]-k);
          max=Math.max(arr[i-1]+k,arr[n-1]-k);
          diff=Math.min(diff, max-min);
        }



        return diff;
    }
        public static void main(String[] args) {
        // int arr[]={7, 4, 8, 8, 8, 9 };
        int arr[]={1,5,8,10};
        int k=2;
        System.out.println(
        getMinDiff(arr,k));
    }
}