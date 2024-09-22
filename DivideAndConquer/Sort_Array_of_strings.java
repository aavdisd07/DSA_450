package DivideAndConquer;

public class Sort_Array_of_strings{
    static String[] MergeSortString(String[]arr,int si,int ei){
        if(si==ei){
           String A[]= {arr[si]};
            return A;
        }
        int mid=si+(ei-si)/2;
        String[] arr1=MergeSortString(arr, si, mid);
        String [] arr2=MergeSortString(arr,mid+1, ei);
        String [] arr3=mergeString(arr1,arr2);
        return arr3;
    }
    static String[] mergeString(String arr1[],String[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        String arr3[]=new String[m+n];

        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if((arr1[i].compareTo(arr2[j]))<0){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }

        }
        while(i<m){
            arr3[k++]=arr1[i++];
        }
        while(j<n){
            arr3[k++]=arr2[j++];
        }

        return arr3;

    }
    public static void main(String[] args) {
        String []arr={"moon","rink","rain","bottle"};
        String ansArr[]=MergeSortString(arr,0,arr.length-1);
        for (String var : ansArr){
            System.out.print(var+" ");
        }
    }

   
}