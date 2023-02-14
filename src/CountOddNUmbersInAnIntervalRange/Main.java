package CountOddNUmbersInAnIntervalRange;

import java.util.ArrayList;
import java.util.List;

public class Main {
}
class Solution {
	public int countOdds(int low, int high) {
		int count = 0;
		if (low % 2 == 0) {
			// low is even, start with the next odd number
			low++;
		}
		for (int i = low; i <= high; i += 2) {
			count++;
		}

		return count;
	}
}
