package findTheIndexOfTheFirstOccurrenceInAString;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        String haystack3 = "hello";
        String needle3 = "ll";


        System.out.println(solution.strStr(haystack, needle));
        System.out.println(solution.strStr(haystack2, needle2));
        System.out.println(solution.strStr(haystack3, needle3));
    }

}

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;


        StringBuffer firstWord = new StringBuffer(haystack);
        StringBuffer secondWord = new StringBuffer(needle);

        for (int i = 0; i <= haystack.length() - needle.length() ; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
