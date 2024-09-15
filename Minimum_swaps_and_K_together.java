public class Minimum_swaps_and_K_together{
    public static void main(String[] args) {
        int arr[]={1,2,5,6,3};
        int k=3;
        int good=0;
       int bad=0;
       for(int l:arr){
        if(l<=k){
            good++;
        }
       }
       for(int i=0;i<good;i++){
        if(arr[i]>k){
            bad++;

        }
       }
       int ans=bad;
       int l=0;
       int r=good-1;
       while(r<arr.length){
        if(arr[l]>k){bad--;}
        if(arr[r]>k){bad++;}
        r++;
        l++;
       ans=Math.min(ans,bad);

       }
        System.out.println(ans);
    } 
}
