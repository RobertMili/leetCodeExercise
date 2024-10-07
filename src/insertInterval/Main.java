package insertInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] intervals2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval2 = {4, 8};


        solution.insert(intervals, newInterval);


    }
}

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
             list.add(intervals[i++]);
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval = new int[]{
                    Math.min(intervals[i][0], newInterval[0]),
                    Math.max(intervals[i][1], newInterval[1])
            };
            i++;
        }
        list.add(newInterval);

        while (i < n) {
            list.add(intervals[i++]);
        }

        System.out.println(Arrays.deepToString(list.toArray(new int[list.size()][])));

        return list.toArray(new int[list.size()][]);

    }
}
