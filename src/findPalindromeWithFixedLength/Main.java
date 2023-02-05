package findPalindromeWithFixedLength;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] num1 = {2,201429812,8,520498110,492711727,339882032,462074369,9,7,6};
        int num2 = 3;
        System.out.println(Arrays.toString(solution.kthPalindrome(num1, num2)));

    }
}

class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int palindromesLength = queries[queries.length - 1];
        int palindrom = 10;
        long[] longsArray = new long[palindromesLength];
        int digits = 1;
        boolean stop = true;
        int firstDigit = 0;
        int temp = 0;
        int j = 0;

        long[] test = new long[queries.length];

        for (int i = 0; i < intLength - 1; i++) {
            digits *= 10;
        }

        palindrom = digits;

        while (stop) {

            int x = palindrom;
            int lastDigit = 0;
            int sum = 0;
            firstDigit = x;

            while (x > 0) {
                lastDigit = x % 10;
                sum = (sum * 10) + lastDigit;
                x = x / 10;
            }
            if (firstDigit == sum) {

                longsArray[j] = firstDigit;


                if (temp == palindromesLength - 1) {
                    stop = false;
                }
                temp++;
                j++;
            }
            palindrom++;

        }


        System.out.println(intLength);

        List<Integer> listSavingNumbers = new ArrayList<>();
        for (int num : queries) {
            listSavingNumbers.add((int) longsArray[num - 1]);
        }



        long[] result = listSavingNumbers.stream().mapToLong(l -> l).toArray();
        return result;

    }
}

