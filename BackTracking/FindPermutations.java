package BackTracking;

public class FindPermutations {
    static void FindPermutations(String str,String ans){
        // base case 
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        // Recursive case
        for(int i=0;i<str.length();i++){
            // get the char at i
            char ch=str.charAt(i);
            // remove the i th character from string
            String NewStr=str.substring(0,i)+str.substring(i+1);
            FindPermutations(NewStr,ans+ch);
        }

    }
    public static void main(String[] args) {
        String str="abc";
        FindPermutations(str,"");
        System.out.println("****");
        FindPermutations2(str,"");
    }


    static void FindPermutations2(String str,String ans){
        // base case--->
       if(str.length()==0){
        System.out.println(ans);
        return;
       }


        for(int i=0;i<str.length();i++){
            // take a character from string
            char ch=str.charAt(i);
            // remove taken character from string and make new string
            String NewString =str.substring(0,i)+str.substring(i+1);
            FindPermutations2(NewString, ans+ch); 
        }



        // recursion

    }
}
