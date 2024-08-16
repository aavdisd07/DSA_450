package Star_pattern;

public class Butterfly{

    public static void main(String[] args) {
        int col = 8;
        for (int i = 0; i < 4; i++) {

            for (int start = 0; start <= i; start++) {
                System.out.print("*");
            }
            for (int spaces = i + 1; spaces < col - i - 1; spaces++) {
                System.out.print(" ");
            }
            for (int end = 0; end <= i; end++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int start = 0; start < 4 - i; start++) {
                System.out.print("*");
            }
            for (int space = 0; space < 2 * i; space++) {
                System.out.print(" ");
            }
            for (int end = 0; end < 4 - i; end++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
