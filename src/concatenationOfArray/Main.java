package concatenationOfArray;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] num = {1,2,1};

        solution.getConcatenation(num);
    }

}

class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] copy = nums.clone();

        int[] original = new int[nums.length + copy.length];

        System.arraycopy(nums,0,original,0,nums.length);
        System.arraycopy(copy,0,original,nums.length,copy.length);


        return original;
    }
}


    /*       0 1 2 3 4 5
            [0,2,1,5,3,4]

            [0,1,2,4,5,3]
        [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]


        */