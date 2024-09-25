package twoSum2InputArrayIsSorted;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nb = {2,7,11,15};
        int target = 9;
        int[] nb2 = {2,3,4};
        int target2 = 6;


        solution.twoSum(nb2, target2);


    }
}
class Solution {
    public int[] twoSum (int[] numbers, int target) {
        int count;
        int[] resum = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                System.out.println("i " + numbers[i]);
                System.out.println("j " + numbers[j]);


                count = numbers[i] + numbers[j];
                if (count == target) {
                    resum[0] = i + 1;
                    resum[1] = j + 1;

                    System.out.println(Arrays.toString(resum));
                    return resum;

                }
                count = 0;
            }
        }

        return numbers;
    }
}
