package CountOddNUmbersInAnIntervalRange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	Solution solution = new Solution();

	@Test
	void testing3and7result3(){

		var result = solution.countOdds(3,7);

		assertEquals(3,result);
	}
	@Test
	void testing8and10result1(){
		var result = solution.countOdds(8,10);

		assertEquals(1,result);
	}
	@Test
	void testLongNumbers(){
		var result = solution.countOdds(800445804,979430543);

		assertEquals(89492370,result);
	}

}
