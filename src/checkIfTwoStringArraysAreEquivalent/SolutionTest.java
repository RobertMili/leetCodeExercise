package checkIfTwoStringArraysAreEquivalent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	Solution solution = new Solution();
	@Test
	void arrayStringAreEqual() {
		String[] word1 = {"ab","c"};
		String[] word2 = {"a","bc"};

		var result = solution.arrayStringAreEqual(word1,word2);

		assertEquals(true,result);
	}
}
