class NextPermutation{
    public static void main(String args[]){
        int arr[]={1,2,3};
        int first=-1;
        int second=-1;

        // first find the breakpoint where the arr[previous]<arr[next]
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                first=i;
                break;
            }
        }
        // if arr is in descending order then just retuern the reverse of basic arr
        if(first==-1)
        {
            reverse(arr,0,arr.length-1);
        }
        // if we found the break point then find the one large number from first
        else{
            for(int i=arr.length-1;i>=0;i--){
               if(arr[i]>arr[first]){
                second=i;
                break;
               }


            }

            // swap that two numbers 
            swap(arr,first,second);
        //   and reverse the arr from first to second index
            reverse(arr,first+1,second);
        }

         for(int x:arr){
            System.out.print(x+" ");
         }
        // 1,3,2
    }
    // swap function
    static void swap(int[]nums,int j,int i){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    // reverse function
    static void reverse(int[]nums,int i,int end){
        // int end=nums.length-1;
        while(i<end){
            int temp=nums[i];
            nums[i]=nums[end];
            nums[end]=temp;
            end--;
            i++;   
        }
    }
}