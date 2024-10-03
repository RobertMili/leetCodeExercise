package containsDuplicate2;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1,2,3,1};
        int k = 3;

        int[] nums2 = {1,0,1,1};
        int k2 = 1;

        int[] nums1 = {1,2,3,1,2,3};
        int k1 = 2;

        System.out.println(solution.containsNearbyDuplicate(nums2, k2));
    }
}
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mapping = new HashMap<>();



        for (int i = 0; i < nums.length; i++) {

            if (mapping.containsKey(nums[i])) {

                if (i - mapping.get(nums[i]) <= k) {
                    return true;
                }
            }
            mapping.put(nums[i],i );
        }

        return false;
    }
}
