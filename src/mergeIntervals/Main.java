package mergeIntervals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        solution.merge(intervals);
    }
}

class Solution {
    public int[][] merge (int[][] intervals ) {

        // need to write this agein
            if (intervals.length == 0) {
                return new int[0][];
            }

            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

            List<int[]> merged = new ArrayList<>();
            int[] currentInterval = intervals[0];
            merged.add(currentInterval);

            for ( int[] interval : intervals) {
                int cuurentEnd = currentInterval[1];
                int nextStart = interval[0];
                int nextEnd = interval[1];

                if (cuurentEnd >= nextStart) {
                    currentInterval[1] = Math.max(cuurentEnd, nextEnd);
                } else {
                    currentInterval = interval;
                    merged.add(currentInterval);
                }
            }
                return merged.toArray(new int[merged.size()][]);


    }
}