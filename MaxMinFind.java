

class MaxMinFind{
 static class Min_max  {
    int max,min;
 }
 static Min_max FindPair(int arr[],int n){
   Min_max ans=new Min_max();
   if(n==1){
      ans.max=ans.min=arr[0];
      return ans;
   }
   if(arr[1]>arr[0]){
      ans.max=arr[1];
      ans.min=arr[0];
   }
   else{
      ans.max=arr[0];
      ans.min=arr[1];
   }
   for(int i=2;i<n;i++){
      if(arr[i]>ans.max){
         ans.max=arr[i];
       
      }
      else if(arr[i]<ans.min){
         ans.min=arr[i];
      }
   }






 return ans;
 }
 public static void main(String[] args) {
   int arr[]={23,53,12,56,9,544,313,56,989,6,13,24,06};
   Min_max ans=FindPair(arr,arr.length);
   System.out.println(ans.max+" "+ans.min);
 }


}   