package rotateArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nb = {1,2,3,4,5,6,7};
        int k = 3;

        solution.rotate(nb, k);


    }
}
class Solution {
    public void rotate (int[] nums, int k) {
        k = k % nums.length; // In case k is greater than the length of the array
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
