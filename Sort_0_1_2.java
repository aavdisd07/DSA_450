
class Sort_012{
    static void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void sort(int arr[],int l){
        int mid=0;
        int low=0;
        int high=l-1;
        while(mid<=high){
            switch (arr[mid]) {
                case 0 -> {
                    swap(arr,mid,low);
                    mid++;
                    low++;
                }
                case 1 -> mid++;
                default -> {
                    swap(arr,mid,high);
                    high--;
                }
            }

        }
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        // int arr[]={0,1,2,1,2,1,2,2,1,1,1,1,1,0,0,0,1,0,2,1,0};
        int arr[]={1,0,1,0,0,2,2,0};
        sort(arr,arr.length);

    }
}