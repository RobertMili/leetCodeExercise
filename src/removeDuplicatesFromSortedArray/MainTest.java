package removeDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

	Solution solution = new Solution();
	@Test
	void firstTest() {

		int[]nums = {1,1,2};
		var result = solution.removeDuplicates(nums);

		assertEquals(2,result);
	}

}