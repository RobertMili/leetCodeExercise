package rotateImage;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7}, {15,14,12,16}};
        solution.rotate(matrix2);
    }

}

class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;


        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < n / 2; j++) {

//                // temp = bottom left
               int temp = matrix[n - 1 - j][i];
////                System.out.println(temp);
//
////                // bottom left = bottom right
               matrix[n - 1 -j][i] = matrix[n - 1 - i][n -j - 1];
////                System.out.println(matrix[n - 1 - j][n -1 - i]);

                //bottom right  = top right
                matrix[n - 1 - i][n -j - 1] = matrix[j][n - 1 - i];
//                System.out.println(matrix[j][n - 1 - i]);

                // top right = top left
                matrix[j][n - 1 - i] = matrix[i][j];

//                // top left = temp
               matrix[i][j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
