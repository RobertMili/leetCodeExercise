package sprialMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        solution.spiralMatrix(matrix);

    }
}

class Solution {
    public List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;


       while (rowBegin <= rowEnd && colBegin <= colEnd) {

           //Travel right
           for (int i = colBegin; i <= colEnd; i++) {
               list.add(matrix[rowBegin][i]);
           }
           rowBegin++;

           // Travel down
           for (int i = rowBegin; i <= rowEnd; i++) {
               list.add(matrix[i][colEnd]);
           }
           colEnd--;

           if (rowBegin <= rowEnd) {
               //Travel left
               for (int i = colEnd; i >= colBegin; i--) {
                   list.add(matrix[rowEnd][i]);
               }
               rowEnd--;
           }

           if (colBegin <= colEnd) {
               for (int i = rowEnd; i >= rowBegin ; i--) {
                   list.add(matrix[i][colBegin]);
               }
               colBegin++;
           }
       }

        System.out.println(list);
        return list;
    }
}
