package runingSumOf1DArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void Example1(){
		int[] nums = {1,2,3,4};
		int[] expected = {1,3,6,10};
		var result = solution.runningSum(nums);

		assertEquals(Arrays.toString(expected),Arrays.toString(result));
	}

	@Test
	void Example2() {
		int[] nums = {1,1,1,1,1};
		int[] expected = {1,2,3,4,5};

		var result = solution.runningSum(nums);

		assertEquals(Arrays.toString(expected),Arrays.toString(result));
	}
	@Test
	void Example3() {
		int[] nums = {3,1,2,10,1};
		int[] expected = {3,4,6,16,17};

		var result = solution.runningSum(nums);

		assertEquals(Arrays.toString(expected),Arrays.toString(result));
	}
}
