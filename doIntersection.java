

import java.util.ArrayList;
import java.util.HashSet;

public class doIntersection {
    //using set
    static void  find_int_Set(int arr1[],int arr2[]){
        HashSet<Integer> s=new HashSet<Integer>();
        ArrayList <Integer>ans= new ArrayList<>();
        for(int j:arr1){
            s.add(j);
        }
        for(int k:arr2){
            if(s.contains(k)){
                ans.add(k);
                System.out.print(k+" ");
                s.remove(k);
            }
        }
      
    } 

    // Two-Pointers
    static void find_Int_pointer(int arr1[],int arr2[]){
        int j=0;
        int i=0;
        while(i<arr1.length && j<arr2.length){
         if(arr1[i]<arr2[j]){
            i++;
         }
         else if(arr2[j]<arr1[i]){
            j++;
         }
         else{
            System.out.print(arr2[j]+" ");
            i++;
            j++;
         }
        }
        // System.out.print();
    }


    public static void main(String[] args) {
        int arr1[]={ 1, 2, 4, 5, 6,8,9};
        int arr2[]={2, 3, 5, 7 ,8,9};
        // find_int_Set(arr1,arr2);
        find_Int_pointer(arr1,arr2);
    }
    
  

}
