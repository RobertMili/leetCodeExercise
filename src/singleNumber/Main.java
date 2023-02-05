package singleNumber;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] num = {1,0,1};
        solution.singleNumber(num);

    }
}

class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;

        for (int num : nums) {
            result ^=num;
        }


        return result;
    }
}



/*
      int numPrint = 0;

        List<Integer> numNotEqual = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {

                System.out.println("i " + nums[i]);
                System.out.println("j " + nums[j]);
                if (nums[i] == nums[j]) {
                    nums[i] = 0;
                    nums[j] = 0;
                }
                    numNotEqual.add(nums[i]);
                    numNotEqual.add(nums[j]);

            }
            System.out.println(numNotEqual);
        }
        return numPrint;
 */