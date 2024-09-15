public class Countsubstr {
    static int substr(String str,int startindex,int lastindex,int length){
        if(length==1){
            return 1;
        }
        if(length<=0){
            return 0;
    }

      int res=substr(str, startindex+1, lastindex, length-1)+substr(str, startindex, lastindex-1, length-1)-substr(str, startindex+1, lastindex-1, length-2);

      if(str.charAt(startindex)==str.charAt(lastindex)){
        res++;
      }
     return  res;


    }
    public static void main(String[] args) {
        String str="abcab";
       System.out.println(substr(str, 0, str.length()-1, str.length()));
    }
}
