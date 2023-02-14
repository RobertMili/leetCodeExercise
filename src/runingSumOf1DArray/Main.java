package runingSumOf1DArray;

import java.util.Arrays;

public class Main {
}

class Solution {
	public int[] runningSum(int[] nums ){
		int[] numsCopy = Arrays.copyOf(nums,nums.length);
		int[] result = new int[nums.length];
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			temp += numsCopy[i];
			result[i] =temp;
		}

		return result;
	}
}
