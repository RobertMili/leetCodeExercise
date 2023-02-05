package plusOne;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] exempel = {1,2,3};

        System.out.println(Arrays.toString(solution.plusOne(exempel)));

    }
}

class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0 ; i--) {
            if (digits[i] < 9 ){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int [] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}