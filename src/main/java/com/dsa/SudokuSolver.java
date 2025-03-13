package com.dsa;

public class SudokuSolver {

    public boolean solveSudoku(char[][] board) {
        return solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') { // If the cell is empty
                    for (char num = '1'; num <= '9'; num++) { // Try all digits
                        if (isValid(board, row, col, num)) { // Check if the number is valid
                            board[row][col] = num; // Place the number
                            if (solve(board)) { // Recur to solve the next cell
                                return true; // If successful, return true
                            }
                            board[row][col] = '.'; // Undo the move (backtrack)
                        }
                    }
                    return false; // If no number works, return false
                }
            }
        }
        return true; // If all cells are filled, the board is solved
    }


    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            // Check the row
            if (board[row][i] == num) return false;

            // Check the column
            if (board[i][col] == num) return false;

            // Check the 3x3 subgrid
//            if (board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == num) return false;
        }

        // Check the 3x3 subgrid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        SudokuSolver solver = new SudokuSolver();
        if (solver.solveSudoku(board)) {
            for (char[] row : board) {
                for (char c : row) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }
}

