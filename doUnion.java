

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class doUnion {
   static int FindUnionLengthSimple(int arr1[],int arr2[]){
    int ans[]=new int[arr1.length+arr2.length];
    int count=0;
    for(int i=0;i<arr1.length;i++){
        ans[i]=arr1[i];
    } for(int i=0;i<arr2.length;i++){
        ans[arr1.length+i]=arr2[i];
    }
    Arrays.sort(ans,0,ans.length);
    for(int i=0;i<arr1.length+arr2.length;i++){
        if (i == 0 || ans[i] != ans[i - 1]) {
            count++;
        } 
    }
    for(int j:ans){
        System.out.print(j+" ");
    }
      
    return count;
 
   }
    
   @SuppressWarnings("unchecked")
static int SetUnion(int arr1[],int arr2[]){
    HashSet s=new HashSet<Integer>();
    for(int i=0;i<arr1.length;i++){
        s.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        s.add(arr2[i]);
    }
    System.out.print(s);
    return s.size();
    
    
   }

   static int Mapunion(int arr1[],int arr2[]){
    HashMap<Integer,String> m=new HashMap<>();
    for(int i=0;i<arr1.length;i++){
        m.put(arr1[i], null);

    }
    for(int i=0;i<arr2.length;i++){
        m.put(arr2[i], null);
        
    }
    
        System.out.println(m.keySet());
    
    return m.size();
   }
   public static void main(String[] args) {
        int arr1[]={234,67,555};
        int arr2[]={4,5,67,321,546,555,42};
        // System.out.print("Size of Union Array:"+FindUnionLengthSimple(arr1,arr2));
        System.out.println(SetUnion(arr1,arr2));
        System.out.println(Mapunion(arr1,arr2));
       
    }
}
