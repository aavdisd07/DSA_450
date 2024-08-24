public class Rearr_Alt_pos_neg {
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        
          int neg=1;
          int pos=0;

         int ans[]=new int[arr.length];
         for(int i=0;i<arr.length;i++){
           if(pos<arr.length || neg<arr.length){
            if(arr[i]>0){
                ans[pos]=arr[i];
               pos=pos+2;
            }
            else{
                ans[neg]=arr[i];
                neg=neg+2;
            }
           }
          
         }  

         for(int k:ans){
            System.out.print(k+" ");
         }
      
    }
}
