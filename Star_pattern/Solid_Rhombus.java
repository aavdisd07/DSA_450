package Star_pattern;

public class Solid_Rhombus {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int space = 0; space < 4 - i; space++) {
                System.out.print(" ");
            }
            for (int start = 0; start < 5; start++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *****
// *****
// *****
// *****
// *****
