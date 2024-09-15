public class PrintOccurences {
    static void Find(int arr[],int index,int key){
        if(index==arr.length){
            return;
        }
        if(arr[index]==key){
            System.out.print(index+" ");
        }
        Find(arr, index+1, key);
    }
    
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7};
        int key=2;
        Find(arr,0,key);
    }
}
