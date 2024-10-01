package setMatrixZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][]  matrix = {{1,1,1},{1,0,1},{1,1,1}};

        int[][] newMatrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//        solution.setZeroes(matrix);

        int[][] failMatrix = {{0,1}};

        solution.setZeroes(newMatrix);

    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;

        //Set markers in first row and first colum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    if (i == 0) firstRow = true;
                    if (j == 0) firstCol = true;

                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //replace inner matrix
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j <matrix[0].length ; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] =0;
            }
        }

        //Last remainging checks
        if (firstRow)
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }

        if (firstCol)
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        System.out.println(Arrays.deepToString(matrix));
    }
}
