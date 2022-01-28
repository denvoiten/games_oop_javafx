package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (vertical(board, index) || horizontal(board, index)) {
                rsl = true;
            }

        }
        return rsl;
    }

    public static boolean vertical(int[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean horizontal(int[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
