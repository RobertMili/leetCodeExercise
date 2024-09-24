package twoSumSecond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nb = {2,5,5,11};
        int t = 10;

        solution.twoSum(nb, t);
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i] );
        }
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                sum = list.get(i) + list.get(j);
                if (sum == target) {
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        System.out.println(Arrays.toString(output));
        return output;
    }
}
