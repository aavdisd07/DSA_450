package Star_pattern;

public class Diamond_Number {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int space = 0; space < 5 - i; space++) {
                System.out.print(" ");
            }
            for (int n = 0; n <= i; n++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

}

//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5
