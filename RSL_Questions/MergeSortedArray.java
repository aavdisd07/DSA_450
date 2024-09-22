package RSL_Questions;

public class MergeSortedArray{
    public static void main(String[] args) {
       int arr1[]={3,6,8,10};
       int arr2[]={3,4,5,7,9,12}; 

       int newA[]=new int[arr1.length+arr2.length];
       int i=0;
       int j=0;
       int k=0;
       while(i<arr1.length && j<arr2.length){
        if(arr1[i]<arr2[j]){
            newA[k++]=arr1[i++];
        }
        else{
            newA[k++]=arr2[j++];
        }
       }
       while(i<arr1.length){
        newA[k++]=arr1[i++];
       }
       while(j<arr2.length){
        newA[k++]=arr2[j++];
       }
     
       for(int item:newA){
        System.out.print(item+" ");
       }

    }
}