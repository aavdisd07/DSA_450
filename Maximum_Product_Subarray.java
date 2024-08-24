public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        // int arr[]={6,-3,-10,0,2};
        // int arr[]={2, 3, 4};
        int arr[]={2, 3, 4, 5, -1, 0};

        long maxProd=arr[0];
        long minProd=arr[0];
        long prod=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<0){
                long temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(arr[i],arr[i]*maxProd);
            minProd=Math.min(arr[i],arr[i]*minProd);
            prod=Math.max(prod,maxProd);
        }
        System.out.println("Maximum subArray Production is: "+prod);
    }
}
