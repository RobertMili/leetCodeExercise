package longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";

        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Set to store unique characters in current windows
        Set<Character> set = new HashSet<>();

        //Variable to keep track of the maximum length of substring
        int maxLenght = 0;

        //Starting index of the current window
        int start = 0;


        //Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {

            //If the character is already in the set, remove character from the start
            // of the window until the character can be added
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
            }
            //Add the current character to the set
            set.add(s.charAt(i));

            //Update the maximum length if the current windows
            maxLenght = Math.max(maxLenght, i - start + 1);
        }


        return maxLenght;
    }
}
