package basicCalculator;

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String s = "1 + 1";
        String s2 = " 2-1 + 2";
        String s3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println(solution.calculate(s3));
    }
}

class Solution {
    public int calculate(String s) {

        Stack<Integer> stacking  = new Stack<>();

        var removedEmpty = s.replaceAll("\\s", "").replaceAll("\\(","").replaceAll("\\)", "");


        System.out.println(removedEmpty);
        for (int i = 0; i < removedEmpty.length() - 1; i++) {
            String character = String.valueOf(removedEmpty.charAt(i));

            if ( character.matches("-?\\d+")) {
                stacking.push(Integer.valueOf(character));
            }
            if (!character.matches("-?\\d+")) {
                int firstNumber = stacking.pop();
                int secondNumber = Integer.parseInt(removedEmpty.substring(i + 1,i + 2));
                int sum = 0;

                System.out.println("F " +firstNumber);
                System.out.println("S " + secondNumber);

                if (Objects.equals(character.trim(), "+")) {
                    sum += firstNumber + secondNumber;
                }
                if (Objects.equals(character.trim(), "-")) {
                    sum = firstNumber - secondNumber;
                }

                stacking.push(sum);
                System.out.println("Sum: " + sum);

            }
        }

        System.out.println(stacking);


        return stacking.peek();
    }
}
