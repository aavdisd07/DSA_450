public class Single {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int ones=0;
        int twos=0;
        int arr[]={1,2,1,3,5,6,2,5,6};
        for(int i=0;i<arr.length-1;i++){
            ones=((ones^arr[i])& (~twos));
            twos=((twos^arr[i])& (~ones));
            
        }
        System.out.println(ones);
    }
}
