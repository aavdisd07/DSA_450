public class Tiling {
    static int TilingProblem(int a){
       if(a==1||a==0){
        return 1;
       }
      //  choices  horizontal or vertical
        return TilingProblem(a-2)+ TilingProblem(a-1);
    }
   
    
 public static void main(String[] args) {
    int a=4;
    System.out.println(TilingProblem(a));
 }   
}
