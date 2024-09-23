package RemoveDuplciatesFromSortedArray;

import java.util.*;

public class RemoveDuplciatesFromSortedArray {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {-3, -1, 0, 0, 0, 3, 3};

        solution.removeDuplicates(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
    class Solution {
        public  int removeDuplicates(int[] nums) {

            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {

                numbers.add(nums[i]);
            }
            numbers.stream().sorted();

            Set<Integer> set = new LinkedHashSet<>(numbers);


            int index = 0;
            for (int num : set) {
                nums[index++] = num;
            }

            return set.size();
        }
    }
