package validSudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {

        Solution solution = new Solution();

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
        char[][] board2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] board3 = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        char[][] board4 = {
                {'.', '.', '.', '.', '.', '.', '5', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '5', '2', '.', '.'}
        };

        System.out.println(solution.isValidSudoku(board4));
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Integer> firstSudoku = new ArrayList<>();


        //check if is number appears twice in row
        for (int row = 0; row < board.length; row++) {
            Set<Character> seenNumber = new HashSet<>();

            for (int col = 0; col < board[row].length; col++) {
                char current = board[row][col];

                if (current != '.') {
                    if (seenNumber.contains(current)) {
                        System.out.println("We have duplicate in row " + row);
                        return false;
                    }
                    seenNumber.add(current);
                }
            }
        }
        //check if is number appears twice in column
        for (int col = 0; col < board[0].length; col++) {
            Set<Character> seenNumeber = new HashSet<>();
            for (int row = 0; row < board.length; row++) {
                char current = board[row][col];
                if (current != '.') {
                    if (seenNumeber.contains(current)) {
                        System.out.println("We have duplicate in row " + row);
                        return false;
                    }
                    seenNumeber.add(current);
                }
            }

        }


        for (int row = 0; row < board.length; row += 3) {

            for (int col = 0; col < board[row].length; col += 3) {
                firstSudoku.clear();

                // Checking first row of the subgrid
                firstSudoku.add(Character.getNumericValue(board[row][col]));
                firstSudoku.add(Character.getNumericValue(board[row][col + 1]));
                firstSudoku.add(Character.getNumericValue(board[row][col + 2]));

                // Checking second row of the subgrid
                firstSudoku.add(Character.getNumericValue(board[row + 1][col]));
                firstSudoku.add(Character.getNumericValue(board[row + 1][col + 1]));
                firstSudoku.add(Character.getNumericValue(board[row + 1][col + 2]));

                // Checking third row of the subgrid
                firstSudoku.add(Character.getNumericValue(board[row + 2][col]));
                firstSudoku.add(Character.getNumericValue(board[row + 2][col + 1]));
                firstSudoku.add(Character.getNumericValue(board[row + 2][col + 2]));

                firstSudoku.removeIf(number -> number == -1);


                for (int j = 0; j < firstSudoku.size() - 1; j++) {
                    for (int k = j + 1; k < firstSudoku.size(); k++) {
                        if (firstSudoku.get(j).equals(firstSudoku.get(k))) {
                            return false;

                        }
                    }
                }
            }

        }


        return true;
    }
}
