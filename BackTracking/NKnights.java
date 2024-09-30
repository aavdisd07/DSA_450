public class NKnights {

    static int count = 0;

    static boolean isSafe(char[][] board, int row, int col) {
        // Check all possible knight moves and ensure we don't go out of bounds

        // Upper-left L-shape
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1] == 'K') {
            return false;
        }
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2] == 'K') {
            return false;
        }

        // Upper-right L-shape
        if (row - 2 >= 0 && col + 1 < board.length && board[row - 2][col + 1] == 'K') {
            return false;
        }
        if (row - 1 >= 0 && col + 2 < board.length && board[row - 1][col + 2] == 'K') {
            return false;
        }

        // Lower-left L-shape
        if (row + 2 < board.length && col - 1 >= 0 && board[row + 2][col - 1] == 'K') {
            return false;
        }
        if (row + 1 < board.length && col - 2 >= 0 && board[row + 1][col - 2] == 'K') {
            return false;
        }

        // Lower-right L-shape
        if (row + 2 < board.length && col + 1 < board.length && board[row + 2][col + 1] == 'K') {
            return false;
        }
        if (row + 1 < board.length && col + 2 < board.length && board[row + 1][col + 2] == 'K') {
            return false;
        }

        return true;
    }

    // Print the chessboard
    static void PrintBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void PlaceNKnight(char[][] board, int row) {
        if (row == board.length) {
            PrintBoard(board);
            count++;
            return;
        }
        for (int i = 0; i < board.length; i++) {

            // check the Knight is safe or not?
            if (isSafe(board, row, i)) {
                // place the knight in box
                board[row][i] = 'K';
                // Recursion call for next row
                PlaceNKnight(board, row + 1);
                // BackTrack the Function
                board[row][i] = '-';
            }

        }
    }

    public static void main(String[] args) {
        int size = 2;
        char[][] board = new char[size][size];

        for (char[] board1 : board) {
            for (int j = 0; j < board.length; j++) {
                board1[j] = '-';
            }
        }
        PlaceNKnight(board, 0);
        System.out.println(count);
    }
}
