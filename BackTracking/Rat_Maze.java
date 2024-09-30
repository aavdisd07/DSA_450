public class Rat_Maze {
    static void PrintMaze(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        return;
    }

    static boolean isSafe(int[][] maze, int row, int col) {
        return (row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1);
    }

    static boolean MazeUtil(int[][] maze, int row, int col, int board[][]) {
        // base case
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            board[row][col] = 1;
            return true;
        }
        // recursion
        if (isSafe(maze, row, col)) {
            if (board[row][col] == 1) {
                return false;
            }
            board[row][col] = 1;
            if (MazeUtil(maze, row + 1, col, board)) {
                return true;
            }
            if (MazeUtil(maze, row, col + 1, board)) {
                return true;
            }

            // backTrack
            board[row][col] = 0;

        }

        return false;
    }

    static void solveMaze(int[][] maze) {
        int board[][] = new int[maze.length][maze.length];
        if (MazeUtil(maze, 0, 0, board)) {
            PrintMaze(board);
        } else {
            System.out.println("solution not exist");
        }
    }

    public static void main(String[] args) {
        int Maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        solveMaze(Maze);

    }
}

/*
 * Algorithm -
 * 1. Create a solution matrix, initially filled with 0’s.
 * 2. Create a recursive function, which takes the initial matrix, output matrix
 * and position
 * of rat (i, j).
 * 3. if the position is out of the matrix or the position is not valid then
 * return.
 * 4. Mark the position output[i][j] as 1 and check if the current position is
 * destination or
 * not. If destination is reached print the output matrix and return.
 * 5. Recursively call for position (i+1, j) and (i, j+1).
 * 6. Unmark position (i, j), i.e output[i][j] = 0.
 */