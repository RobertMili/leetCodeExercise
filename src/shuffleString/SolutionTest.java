package shuffleString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	Solution solution = new Solution();
	@Test
	void restoreString() {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};

		var result = solution.restoreString(s,indices);

		assertEquals("leetcode",result);
	}
}
