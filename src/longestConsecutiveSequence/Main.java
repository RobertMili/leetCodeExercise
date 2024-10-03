package longestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[]nums = {100,4,200,1,3,2};
        int[]nums2 = {0,3,7,2,5,8,4,6,0,1};
        int[]nums3 = {9,1,4,7,3,-1,0,5,8,-1,6};

        System.out.println(solution.longestConsecutive(nums3));
    }
}
class Solution {
    public int longestConsecutive(int[] nums ){
        if (nums.length == 0) {
            return 0;
        }

       Set<Integer> numSet = new HashSet<>();

    for (int num : nums) {
        numSet.add(num);
    }

    int longestStreak = 0;

    for (int num : nums ) {

        if (!numSet.contains( num - 1)) {
            int currentNum = num;
            int currentStreak = 1;


            while (numSet.contains(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }

            longestStreak = Math.max(longestStreak,currentStreak);
        }
    }
    return longestStreak;

    }
}
