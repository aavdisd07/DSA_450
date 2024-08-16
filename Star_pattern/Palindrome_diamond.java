package Star_pattern;

public class Palindrome_diamond {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int space = 0; space < 7 - i; space++) {
                System.out.print(" ");
            }
            for (int start = i + 1; start >= 1; start--) {
                System.out.print(start);
            }
            for (int n = 2; n <= i + 1; n++) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}




//     1
//    212
//   32123
//  4321234
// 543212345