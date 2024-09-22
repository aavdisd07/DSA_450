package RSL_Questions;

public class KthNonRepeatingChar {
    // brute force Approach O(N^2)  just 2 loops
    static char firstNonRepeatingChar(String s,int k) {
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                k--;
                if(k==0){
                    return  s.charAt(i);
                }
            }
        }

        return '\0';
    }
    // 2nd Approach  O(n) using a count arr of size 26
    static char SecondApproach(String s,int k){
        int count[]=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1){
                k--;
                if(k==0){
                    return  s.charAt(i);
                }
             }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String s = "avantika";
        System.out.println(firstNonRepeatingChar(s,4));
        System.out.println(SecondApproach(s,1));
    }
}
