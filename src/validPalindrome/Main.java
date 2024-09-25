package validPalindrome;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        String s1 = "0P";

        System.out.println(solution.isPalindrome(s));

    }
}
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");


        var lowerCase = s.toLowerCase();
        String backward = "";
        StringBuffer reverse = new StringBuffer();
        reverse.append(lowerCase);
        backward = String.valueOf(reverse.reverse());


        if (backward.equals(lowerCase)) {
            return true;
        }

        return false;
    }
}
