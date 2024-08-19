package SortingAlgorithm;

public class SelectionSort {
    static void Selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,12,64,1,78,9,3};
        Selection(arr);
    }
}
