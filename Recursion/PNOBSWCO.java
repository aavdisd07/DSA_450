


public class PNOBSWCO {

    static void print(int length, int lastPlace, String str) {
        //    for not 11
        if (length == 0) {
            System.out.println(str);
            return;
        }
        print(length - 1, 0, str + "0");
        if (lastPlace == 0) {
            print(length - 1, 1, str + "1");
        }

    }

    static void Print(int length, int lastIndex, String str) {
        // for not 00
        if (length == 0) {
            System.out.println(str);
            return;

        }
        Print(length-1,1,str+"1");
        if(lastIndex==1){
            Print(length-1,0,str+"0");
        }


    }

    public static void main(String[] args) {
        print(3, 0, "");
        System.out.println("");
        Print(3, 1, "");

        
    }

}
