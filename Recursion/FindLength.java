public class FindLength {
    static void  Count(String str,int count,int index){
      if(index==str.length()){
        System.out.println(count);
        return; 
      }
      Count(str,count+1,index+1);
    }

  // second approach---->
  static int SubCount(String str){
    if(str.length()==0){
      return 0;
    }

   return SubCount(str.substring(1))+1;
  } 

    public static void main(String[] args) {
        String str="hell";
         Count(str,0,0);
         System.out.println(SubCount(str));
         System.out.println(str.substring(0));
         System.out.println(str.substring(1));

         System.out.println(str.substring(2));

         System.out.println(str.substring(3));

         System.out.println(str.substring(4));

    }
}
