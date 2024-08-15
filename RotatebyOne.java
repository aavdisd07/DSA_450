

public class RotatebyOne {
    static void rotate(int[] arr) {
        // code here
        int last=arr[arr.length-1];
        int temp=-1;
        int temp1=arr[0];
        for(int i=1;i<arr.length;i++){
            temp=arr[i];
            arr[i]=temp1;
            temp1=temp;
        }
        arr[0]=last;
        for(int j:arr){
            System.out.print(j+" ");
        }
        
    }
    static void rotate2(int arr[]){
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
               arr[i]=arr[i-1];
        }
        arr[0]=last;

        for(int j:arr){
            System.out.print(j+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        // rotate(arr);
        System.out.println("++++++++++++++++++++++++");
        rotate2(arr); 

    }
}
