public class Bin_TO_Dec {

   static void Bin_Dec(int bin){
      int pow=0;
      int dec=0;

      while(bin>0){
         int num=bin%10;
         dec+=num*(int)Math.pow(2, pow);
         bin/=10;
         pow++;
      }

      System.out.print(dec);
   }


 public static void main(String[] args) {
    Bin_Dec(111);
 }    
}
