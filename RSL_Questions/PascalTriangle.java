package RSL_Questions;

public class PascalTriangle {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) { // to find rows
            // To print spaces first
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // to print numbers
            int number = 1;
            for (int n = 0; n <= i; n++) {
                System.out.print(number + " ");
                // the main task is to print the next number
                number = number * (i - n) / (n + 1);
            }
            System.out.println();

            System.out.println();
            System.out.println();
            prinPascalT(4);

        }
    }

}
