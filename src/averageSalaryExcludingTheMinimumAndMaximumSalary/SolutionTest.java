package averageSalaryExcludingTheMinimumAndMaximumSalary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	Solution solution = new Solution();

	@Test
	void testExample1() {

		int[] salary = {4000,3000,1000,2000};

		var result = solution.average(salary);

		assertEquals(2500.0000, result);
	}
	@Test
	void testExample2() {

		int[] salary = {8000,9000,2000,3000,6000,1000};

		var result = solution.average(salary);

		assertEquals(4750.00000, result);
	}


}
