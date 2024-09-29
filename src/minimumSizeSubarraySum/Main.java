package minimumSizeSubarraySum;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numb = {2,3,1,2,4,3};
        int target = 7;

        int[] numb2 = {1,1,1,1,1,1,1,1};
        int target2 = 11;

        int[] numb3 = {1,2,3,4,5};
        int target3 = 11;


        System.out.println(solution.minSubArrayLen(target, numb));

    } 
}
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        List<Integer> output = new ArrayList<>();
        int minLenWindow = Integer.MAX_VALUE;
        int currentSum =0;
        int low = 0;


        for (int high = 0; high < nums.length; high++) {
            currentSum += nums[high];

            while (currentSum >= target) {
                int currentWindowSize = high - low + 1;

                minLenWindow = Math.min(minLenWindow, currentWindowSize);

                currentSum -= nums[low];

                low++;
            }
        }

        return minLenWindow == Integer.MAX_VALUE ? 0 : minLenWindow;
    }
}
