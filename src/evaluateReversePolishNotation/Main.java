package evaluateReversePolishNotation;

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] token = {"2", "1", "+", "3", "*"};
        String[] token2 = {"4", "13", "5", "/", "+"};

        System.out.println("this is a return " + solution.evalRPN(token2));

    }
}

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stacking = new Stack<>();


        for (int i = 0; i < tokens.length; i++) {

            if (tokens[i].matches("-?\\d+")) {
                stacking.push(Integer.valueOf(tokens[i]));
            }

            if (!tokens[i].matches("-?\\d+")) {
                int firstNumber = stacking.pop();
                int secondNumber = stacking.pop();
                int sum = 0;

                if (Objects.equals(tokens[i], "+")) {
                    sum = firstNumber + secondNumber;
                }
                if (Objects.equals(tokens[i], "*")) {
                    sum = firstNumber * secondNumber;
                }

                if (Objects.equals(tokens[i], "/")) {
                    sum = secondNumber / firstNumber;
                }

                if (Objects.equals(tokens[i], "-")) {
                    sum = secondNumber - firstNumber;
                }
                stacking.push(sum);
            }
        }


        return stacking.peek();
    }
}
