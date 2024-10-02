package validAnagram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "anagram";
        String t = "nagaram";

        String s2 = "rat";
        String t2 = "car";

        System.out.println(solution.isAnagram(s2, t2));
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Integer,Character> firstWord= new LinkedHashMap<>();


        int[] char_count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char_count[s.charAt(i) - 'a']++;
            char_count[t.charAt(i) - 'a']--;
        }

        System.out.println(Arrays.stream(char_count).sum());

        for (int count : char_count) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
