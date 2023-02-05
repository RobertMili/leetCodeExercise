package validParentheses;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {


        Solution solution = new Solution();

        System.out.println(solution.isValid("["));
    }
}

class Solution {
    public boolean isValid(String s) {

        Stack<Character> sc = new Stack<>();


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '('){
                sc.push(')');
            }
            else if (s.charAt(i) == '{'){
                sc.push('}');
            }
            else if (s.charAt(i) == '['){
                sc.push(']');
            }
            else if (sc.isEmpty() || sc.pop() != s.charAt(i)){
                return false;
            }

        }

        return sc.isEmpty();
    }
}