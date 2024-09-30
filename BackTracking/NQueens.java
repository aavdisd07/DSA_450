public class NQueens {
    static boolean isSafe(char board[][], int row, int col) {

        // check for vertical up if it is possible to place a queen
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // check for vertical left diagonal if it possible to place a queen or not
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; j--, i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // check for vertical right diagonal if it is possible to place a queen or not
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
     static int count=0;   // Here we tracking the number of solutions
     static int NoOfSoln=3; //Here the number of solutions which we want to print
    static void PlaceNQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            if(NoOfSoln>0){
                printBoard(board);
                count++;
                System.out.println("++++++++++++++++++++++");
                NoOfSoln--;
            }
           
            return;
        }
        // Columnar loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) { // check if it is safe for placing queen
                board[row][j] = 'Q'; // place Queen in box
                PlaceNQueens(board, row + 1); // recursion call for placing next queen in next row
                board[row][j] = 'x'; // backtracking if queen can't place in box
            }

        }

    }

    static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 2;
        char board[][] = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = 'x';
            }
        }
        PlaceNQueens(board, 0);
        System.out.println("Number of Solutions-"+count);
    }
}