class FirstOccurence{

    public static int first(int arr[],int key,int ind){
        if(ind==arr.length-1){
            return -1;
        }
        if(arr[ind]==key){
            return ind;
        }
        return first(arr,key,ind+1);
    }
    public static int last(int arr[],int key,int ind){
        if(ind==arr.length){
            return -1;
        }
        int found=last(arr, key, ind+1);

        if(found==-1 && arr[ind]==key){
            return ind;
        }
        return found;
    
    }
    static int FindPower(int a,int p){
        if(p==0){
            return 1;
        }
        return a*FindPower(a, p-1);
    }
     static int CountOnes(int n,int count){
        if(n==0){
            return count;
        }
        if((n&1)==1){
            count++;
        }
      return CountOnes(n>>1,count);

     }
    
     static int OptimizePower(int a,int p){   
        //  O(logp)
        if(p==0){
            return 1;
        }
        int halfpower=OptimizePower(a, p/2);
       int halfpowerSqr=halfpower * halfpower;
        if(p%2==0){
            return halfpowerSqr;
        }
    
         return a*halfpowerSqr;
        
     }


    
    public static void main(String[] args) {
        int arr[]={1,8,2,8,2,7,4,5,8,2,5,7};
        // System.out.println("FIRST OCCURENCE "+first(arr,5,0));
        // System.out.println("Last Occurence  "+ last(arr, 5, 0));
    //    System.out.println(CountOnes(15,0));
        // System.out.println(FindPower(3,6));
        System.out.println(OptimizePower(2, 20));
    }
}