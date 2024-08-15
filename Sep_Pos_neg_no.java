


class Sep_Pos_neg_no{
    static void swap(int start,int end,int arr[]){
 
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void rearrange(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
            
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
       
    }
    static void bySorting(int arr[]){

        int high=arr.length-1;
        int mid=0;
    
        while(mid<high){
            if(arr[mid]<=0){
               
                mid++;
              
            }
           else{
                swap(mid,high--,arr);
              
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    

    static void Twopass(int arr[]){
        int negcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negcount++;
            }

        }
        int i=0;
        int j=negcount;
        while(i<j && j<arr.length){
            if(arr[i]<0){
                i++;
            }
            else if(arr[j]>0)
             j++;
           
          else{
            swap(i++, j++, arr);
            
          }


        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={-12, 11, -13, -5, -555,10000,
            6, -7, 5, -3 };
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println("---------------");
       bySorting(arr);
       System.out.println("---------------");
       rearrange(arr);
    System.out.println("---------------");
    Twopass(arr);

    }
}