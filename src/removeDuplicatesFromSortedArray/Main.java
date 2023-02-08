package removeDuplicatesFromSortedArray;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class Main {
}

class Solution {
	public int removeDuplicates(int[] nums) {

		if (nums.length == 0) return 0;

		int i = 0;

		for (int j = 0; j < nums.length; j++) {

			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}

		return i + 1;

		/*
		test
		 */
	}
}
