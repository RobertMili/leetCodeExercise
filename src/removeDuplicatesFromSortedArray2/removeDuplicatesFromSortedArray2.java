package removeDuplicatesFromSortedArray2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class removeDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nb = {0,0,1,1,1,1,2,3,3};
        solution.removeDuplciates(nb);
    }

}

class Solution {
    public int removeDuplciates( int[]nums) {
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int maxDuplcates = 2;


        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums [i] != nums [i - 1]) {
                count = 1;
                list.add(nums[i]);
            }
            else if (count < maxDuplcates) {
                list.add(nums[i]);
                count++;
            }
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();

    }
}
