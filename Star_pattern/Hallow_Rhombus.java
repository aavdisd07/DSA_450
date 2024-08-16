package Star_pattern;

public class Hallow_Rhombus {

    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int space = 0; space < 4 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < 5; star++) {
                if (star == 0 || star == 4 || i == 0 || i == 4) {
                    System.out.print("*"); 
                }else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }

}

// *****
// *   *
// *   *
// *   *
// *****
