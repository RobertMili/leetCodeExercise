package firstLetterrToAppearTwice;

import java.util.*;

public class main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String t = "abccbaacz";
        System.out.println(solution.repeatedCharacter(t));
    }
}
class Solution {
    public char repeatedCharacter(String s) {

        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {

            if (seen.contains(c)) {
                return c;
            }
            seen.add(c);
        }

        return '_';
    }
}





/*
    abccbaacz
    0 = a;
    1 = b;
    2 = c;  -> first letter som appear.
    3 = c;
    4 = b;
    5 = a;
    6 = a;
    7 = c;
    9 = z;

 */