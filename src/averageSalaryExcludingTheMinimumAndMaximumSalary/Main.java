package averageSalaryExcludingTheMinimumAndMaximumSalary;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Main {
}
class Solution {
	public double average(int [] salary) {
		Arrays.sort(salary);

		double sum = 0;

		for (int i = 1; i < salary.length - 1; i++) {
			sum += salary[i];
		}
		return sum / (salary.length - 2 );

	}
}
