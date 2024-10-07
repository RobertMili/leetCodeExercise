package validParenthesesTwo;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println(solution.isValid(s3));

    }
}

class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);


            // If an opening bracket is found, push the corresponding closing bracket onto the stack
            if (c == '(') {
                stack.add(')');
            } else if (c == '{') {
                stack.add('}');
            } else if (c == '[') {
                stack.add(']');
            }
            // If a closing bracket is found, check if it matches the top of the stack
            else if (stack.isEmpty() || stack.remove(stack.size() - 1) != c) {
                return false; // If it doesn't match, the string is invalid
            }
        }

        System.out.println(stack.size());

        // After processing all characters, the stack should be empty if the input is valid
        return stack.isEmpty();
    }
}