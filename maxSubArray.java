class maxSubArray{
// Kadanes's Algorithm -Maximaum contagious subArray Sum 
    static int answer(int arr[]){
        int max_sum=0;
        int curr_sum=0;
      
        for(int j:arr){
            curr_sum+=j;
            if(curr_sum<0){
                curr_sum=0;
            }
            else if(curr_sum>max_sum){
                max_sum=curr_sum;
            }
        }

      
        return max_sum;
    }

    public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        System.out.println(answer(arr));
    }
}