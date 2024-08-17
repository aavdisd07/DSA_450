public class Dec_To_Bin {
    static void Dec_Bin(int dec){
        int bin=0;
        int pow=0;
      
        while(dec>0){
            int rem=dec%2;
            bin+=rem*Math.pow(10, pow);
            pow++;
            dec=dec/2;
        }
        System.out.println(bin);

    }


    public static void main(String [] args){
     Dec_Bin(10);


    }
}
