package StringQ;

public class LongestCommonPrefix {
    static String LongestCommonPrefix(String [] arr){
      String prefix=arr[0];
      for(int i=1;i<arr.length;i++){
        while(arr[i].indexOf(prefix)!=0){
            prefix=prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty()) return "";
        }
      }
        return prefix;
    } 
    public static void main(String[] args) {
     String arr[]={"flower","flow","flight"};
     System.out.print(LongestCommonPrefix(arr));
}


}
