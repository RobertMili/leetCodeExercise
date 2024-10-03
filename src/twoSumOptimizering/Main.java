package twoSumOptimizering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] twoSum = {16, 4, 23, 8, 15, 42, 1, 2};
        int target = 19;

        solution.twoSum(twoSum, target);


    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapping = new HashMap<>();
        int[] sum2 = new int[2];

        for (int i = 0; i < nums.length; i++) {
            mapping.put(i, nums[i]);
        }


        for (Map.Entry<Integer, Integer> entry : mapping.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        int[] sortedArray = nums;
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));


        int firstIndex = 0;
        int lastIndex = sortedArray.length - 1;

        while (firstIndex < lastIndex) {
            int firstNumber = sortedArray[firstIndex];
            int lastNumber = sortedArray[lastIndex];
            int sum = firstNumber + lastNumber;


            if (sum < target) {
                firstIndex++; // Move the first index to increase the sum
            } else if (sum > target) {
                lastIndex--; // Move the last index to decrease the sum
            } else {

                sum2[0] = firstNumber;
                sum2[1] = lastNumber;
                break;
            }
        }
        int[] result = new int[2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : mapping.entrySet()) {
            if (entry.getValue() == sum2[0] || entry.getValue() == sum2[1]) {
                result[index++] = entry.getKey();

                if (index == 2) break;
            }
        }

        // Return an empty array if no pairs found
        return result;
    }
}

