package summaryRanges;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0,1,2,4,5,7};
        int[] nums2 = {-2147483648,-2147483647,2147483647 };

        solution.summaryRanges(nums2);

    }
}
class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }

        List<String> summarRanges = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
                int startNumber = nums[i];

                while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
                    i++;
                }

                if (startNumber != nums[i]) {
                    summarRanges.add(startNumber + "->" + nums[i]);
                } else {
                    summarRanges.add(String.valueOf(startNumber));
                }


        }

        System.out.println(summarRanges);
        return summarRanges;
    }
}
