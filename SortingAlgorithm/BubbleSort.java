package SortingAlgorithm;

public class BubbleSort {
  static void LINAERBS(int arr[]){
    boolean isSwap=false;
    // This is for O(n)
    for (int i = 0; i < arr.length-1; i++) 
    {
      if(arr[i+1]<arr[i]){
        isSwap=true;
      }
    }    

 System.out.println(isSwap);    
  }
 
  static void Bs(int arr[]){
    int count=0;
    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
              count++;
            }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println(count);

  }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        LINAERBS(arr);
        Bs(arr);
             

    }
    
}
