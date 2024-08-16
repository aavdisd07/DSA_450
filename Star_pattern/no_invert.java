package Star_pattern;

public class no_invert {

    public static void main(String[] args) {

        int row = 5;
        int col = 5;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col - i; j++) {
                System.out.print(j + 1);
            }

            System.out.println();
        }
    }

}

// 12345
// 1234
// 123
// 12
// 1
