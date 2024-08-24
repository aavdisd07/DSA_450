public class Second_Largest {
    public static void main(String[] args) {
        int ar[]={2,4,8,9,7,12,36};
        int max=ar[0];
        int sLarg=ar[0];
        for(int i=0;i<ar.length;i++){
          if(ar[i]>max){
              sLarg=max;
              max=ar[i];
          }
        }
        System.out.println(max);
        System.out.println(sLarg);
    }
}
