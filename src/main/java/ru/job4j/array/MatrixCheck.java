package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (char cell : board[row]) {
            if (cell != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
        for (char[] row : board) {
            if (row[column] != 'X') {
                return false;
            }
        }
        return true;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X' && (monoVertical(board, index) || monoHorizontal(board, index))) {
                return true;
            }
        }
        return false;
    }
}
