package mergeStringAlternately;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void testingMethod() {
		String word1 = "abc";
		String word2 = "pqr";

		var result = solution.mergeAlternately(word1,word2);

		assertEquals("apbqcr",result);

	}
	@Test
	void secondTest() {
		String word1 = "ab";
		String word2 = "pqrs";

		var result = solution.mergeAlternately(word1,word2);

		assertEquals("apbqrs",result);
	}
	@Test
	void thirdsTest() {
		String word1 = "abcd";
		String word2 = "pq";

		var result = solution.mergeAlternately(word1,word2);

		assertEquals("apbqcd",result);
	}

}
