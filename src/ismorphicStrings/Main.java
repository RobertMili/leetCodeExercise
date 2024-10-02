package ismorphicStrings;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "egg";
        String t = "add";

        String s2 = "foo";
        String t2 = "bar";

        String s3 = "bbbaaaba";
        String t3 = "aaabbbba";

        String s4 = "library";
        String t4 = "privacy";

        System.out.println(solution.isIsomorphic(s, t));


    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> maping = new LinkedHashMap<>();
        Set<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!maping.containsKey(original)) {
                // If the replacement character is already mapped to another character, return false
                if (mappedValues.contains(replacement)) {
                    return false;
                }
                maping.put(original, replacement);
                mappedValues.add(replacement);
            } else {
                char mappedCharacter = maping.get(original);
                if (mappedCharacter != replacement) {
                    return false;
                }
            }
        }


        for (Map.Entry<Character, Character> entry : maping.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        return true;
    }
}
