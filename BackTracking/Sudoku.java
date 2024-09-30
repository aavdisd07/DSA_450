public class Sudoku {
    static void printSoduko(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int digit) {
        // check for the column if digit exist
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == digit) {
                return false;
            }
        }

        // check for the column if digit exist
      
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }


        // check for the grid if digit exist

      int stRow=(row/3)*3;
      int stCol=(col/3)*3;
        for(int i=stRow;i<stRow+3;i++){
            for(int j=stCol;j<stCol+3;j++){
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    static boolean sudokuSolver(int[][] board, int row, int col) {

        // base case
        if (row == 9) {
            return true;
        }
        // reset the row and col for the next call
        int nextRow = row;
        int nextCol = col + 1;
        if (col + 1 == 9) {
            nextCol = 0;
            nextRow = row + 1;
        }

        // place the digit if 0 is there

        if (board[row][col] != 0) {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;
                }
                // backtrack the cell
                board[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution Exist");
            printSoduko(sudoku);
        } else {
            System.out.println("No solution exist");
        }

    }
}