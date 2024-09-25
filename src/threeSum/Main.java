package threeSum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] list = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(list));

    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] sorted = Arrays.stream(nums).sorted().toArray();
        Set<List<Integer>> result = new HashSet<>();

        System.out.println(Arrays.toString(sorted));

        for (int i = 0; i < sorted.length - 2; i++) {

            int left = i + 1;
            int right = sorted.length - 1;

            while (left < right) {
                int sum = sorted[i] + sorted[left] + sorted[right];

                if (sum == 0) {
                    result.add(Arrays.asList(sorted[i], sorted[left], sorted[right]));

                    left++;
                    right--;

                    // Skip duplicates for 'left'
                    while (left < right && sorted[left] == sorted[left - 1]) {
                        left++;
                    }

                    // Skip duplicates for 'right'
                    while (left < right && sorted[right] == sorted[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;  // Move right only when sum is greater than 0
                }
            }
        }

        return new ArrayList<>(result);
    }
}