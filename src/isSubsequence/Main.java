package isSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String inputS = "abc";
        String inputT = "ahbgdc";

        String s = "axc";
        String t = "ahbgdc";

        String testS = "acb";
        String testT = "ahbgdc";

        String ab = "ab";
        String baab = "baab";

        String aa = "aaaaaa";
        String bb = "bbaaaa";

        System.out.println(solution.isSubsequence(aa, bb));

    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 1) {
            return false;
        }

        List<Integer> count = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    count.add(j);
                }
            }
        }


        int count2 = 1;
        for (int i = 0; i < count.size() - 1; i++) {
            if (count.get(i) < count.get(i + 1) ) {
                count2 += 1;
            }
        }

        System.out.println("count " + count2);
        System.out.println("s size " + s.length());

        if (s.length() > count2 ) {
            return false;
        }
        return true;
    }
}
