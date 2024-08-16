package Star_pattern;

public class Diamond {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int space = 0; space < 4 - i; space++) {
                System.out.print(" ");
            }
            for (int start = 0; start <= i; start++) {
                System.out.print("*");
            }
            for (int end = 0; end < i; end++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }
            for (int start = i; start < 4; start++) {
                System.out.print("*");
            }
            for (int end = 0; end < 4 - i - 1; end++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}

//      *
//     ***
//    *****
//   *******
//   *******
//    *****
//     ***
//      *
