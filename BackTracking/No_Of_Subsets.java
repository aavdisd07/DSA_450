package BackTracking;

public class No_Of_Subsets {

    static void PrintSubstring(String str, String ans, int index) {
        // base case
        if (index == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Empty String");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // case when char is added
        PrintSubstring(str, ans + str.charAt(index), index + 1);
        // case when char is not added
        PrintSubstring(str, ans, index + 1);
    }

    public static void main(String[] args) {
        String str = "xy";
        PrintSubstring(str, "", 0);
    }
}
