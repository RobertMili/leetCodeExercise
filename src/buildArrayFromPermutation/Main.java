package buildArrayFromPermutation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] testArray = {2,0,1};
        solution.buildArray(testArray);

    }

}
class Solution {
    public static int[] buildArray(int[] nums) {
        int index = 0;

        int[] newArray = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[nums[i]];
        }


        return newArray;
    }
}

/*
Input: nums = [0,2,1,5,3,4]

ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    =         [0,1,2,4,5,3]

Input: nums = [5,0,1,2,3,4]
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    =         [4,5,0,1,2,3]
 */