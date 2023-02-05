package greatestCommonDivisorOfString;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(solution.gcdOfStrings(str1, str2));

    }
}
class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int lengthStr2 = str2.length();
        char firstCharacterStr2 = str2.charAt(0);

        boolean equals = str2.substring(1).equals(str2.substring(0, str2.length() - 1));
        System.out.println("check " + equals);

        for (int i = 0; i < str1.length(); i++) {

            if (firstCharacterStr2 == str1.charAt(i)){
                if (str2.charAt(1) == str1.charAt( i  + 1)){
                    if (str2.charAt(2) == str1.charAt( i + 2)) {
                       return str2;
                    }
                }
            }
        }



        return "";
    }
}

/*

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 */