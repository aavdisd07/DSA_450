
import java.util.HashMap;



public class Elem_more_nByk_{
    public static void main(String[] args) {
        int arr[]={3, 1, 2, 2, 1, 2, 3, 3};
        HashMap<Integer,Integer> ans= new HashMap<>();
       for(int j:arr){
         if(!ans.containsKey(j)){
            ans.put(j, 1);
         }
         else{
            int count=ans.get(j);
            ans.put(j, count+1);
         }

       }
       int k=4;
       int x=arr.length/k;
      
       System.out.println("Current hashMap is: "+ans);


       System.out.println();
       System.out.print("Result is: ");
     ans.forEach((a,b)->{
      if(b>x){
         System.out.print(a+" ");
        }
     }
    
   );
        

      
        
        
    }
    
}
