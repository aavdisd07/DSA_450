

public class PrintInChar {

    static void Convert(String str, int index) {
        if (index == str.length()) {
            return;
        }
        char key = str.charAt(index);
        switch(key) {
            case '0':
                System.out.print("zero ");
                break;
            case '1':
                System.out.print("one ");
                break;
            case '2':
                System.out.print("two ");
                break;
            case '3':
                System.out.print("three ");
                break;
            case '4':
                System.out.print("four ");
                break;
            case '5':
                System.out.print("five ");
                break;
            case '6':
                System.out.print("six ");
                break;
            case '7':
                System.out.print("seven ");
                break;
            case '8':
                System.out.print("eight ");
                break;
            case '9':
                System.out.print("nine ");
                break;
             default: break;    
        }
        Convert(str, index+1);

    }
     // second approach---->
     static String Arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
 
     public static  void Find(int val){
       if(val==0){
         return;
       }
       int lastDigit=val%10;
       Find(val/10);
       System.out.print(Arr[lastDigit]+" ");
     }   

    
    public static void main(String[] args) {
        int val = 2000;
        String str = Integer.toString(val);
        Convert(str, 0);
        System.out.println();
        Find(val);
    }
}
