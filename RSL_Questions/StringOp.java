package RSL_Questions;

public class StringOp {
    // lowercase
    // removeSpace
    // RemoveVowels
    //  ReverseString
     static void StrOperation(String str){
       str=str.toLowerCase();
       str=str.replaceAll("\\s", "");
       str=str.replaceAll("[aeiou]", "");
        StringBuilder st=new StringBuilder(str);
        st.reverse();
       System.out.println(st);
     }  


    public static void main(String[] args) {
        String str="Hello World";
       // Step 1: Convert the string to lowercase
       str = str.toLowerCase();
       // Step 2: Remove spaces
       str = str.replaceAll("\\s+", "");
       // Step 3: Remove vowels (a, e, i, o, u)
       str = str.replaceAll("[aeiou]", "");
       // Step 4: Reverse the string
       StringBuilder reversedStr = new StringBuilder(str);
       reversedStr.reverse();
       System.out.println(reversedStr.toString());
       System.out.println();
       StrOperation(str);
    
    
    }
}
