package DivideAndConquer;

public class MergeSort_Class{
    static void MergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    static void merge(int arr[],int si,int mid,int ei){
       int temp[]=new int[ei-si+1];
       int i=si;
       int j=mid+1;
       int k=0;
       while(i<=mid && j<=ei){
         if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
         }
         else{
            temp[k++]=arr[j++];
         }
       }
       while(i<=mid){
        temp[k++]=arr[i++];
       }
       while(j<=ei){
        temp[k++]=arr[j++];
       }

       for(i=si, k=0;k<temp.length;k++,i++){
        arr[i]=temp[k];
       }

    }
    public static void main(String[] args) {
        int arr[]={4,6,2,34,6,24,75};

        for (int elem : arr) {
            System.out.print(elem+" ");
        }
        System.out.println();
       MergeSort(arr, 0, arr.length-1);
       for (int elem : arr) {
           System.out.print(elem+" ");
       }
    }
}