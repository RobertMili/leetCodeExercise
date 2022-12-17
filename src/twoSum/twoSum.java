package twoSum;

public class twoSum {

    public static void main(String[] args) {
        int[] nums = new int[4];
        int target = 10;
        nums[0] = 2;
        nums[1] = 5;
        nums[2] = 5;
        nums[3] = 11;


        twoSum(nums, target);
    }

    static public int[] twoSum(int[] nums, int target) {
        int firstNUmber = 0;
        int secondNUmber = 0;
        int sum = 0;

        for (int i = 0; i < nums.length - 1 ; i++) {
            for (int j = 1; j < nums.length; j++) {

                     sum = nums[i] + nums[j];
                     if (sum == target ) {
                         firstNUmber = i;
                         secondNUmber = j;
                         if (firstNUmber != secondNUmber) {
                             return new int[]{firstNUmber, secondNUmber};
                         }


                }
            }
        }



       return null;
    }
}