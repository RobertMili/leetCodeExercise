package hIndex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nb1 = {3,0,6,1,5};
        int[] nb2 = {100};

        System.out.println(solution.hIndex(nb1));
    }

}

class Solution {
    public int hIndex(int[] citations) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < citations.length; i++) {
            list.add(citations[i]);
        }

        list = list.stream().sorted().collect(Collectors.toList());
        int n = list.size();

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (list.get(i) >= h) {
                return h;
            }
        }

        return 0;
    }
}
