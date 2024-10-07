package minStack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] commands = {"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"};
        int[][] values = {{}, {-2}, {0}, {-3}, {}, {}, {}, {}};

        List<String> output = new ArrayList<>(); // List to hold output

        MinStack minStack = null; // Declare the MinStack variable

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "MinStack":
                    minStack = new MinStack();
                    output.add(null); // Adding null for initialization
                    break;
                case "push":
                    minStack.push(values[i][0]);
                    output.add(null); // No return value for push
                    break;
                case "pop":
                    minStack.pop();
                    output.add(null); // No return value for pop
                    break;
                case "top":
                    output.add(String.valueOf(minStack.top())); // Capture top value
                    break;
                case "getMin":
                    output.add(String.valueOf(minStack.getMin())); // Capture minimum value
                    break;
                default:
                    output.add("Invalid command."); // Handle invalid commands
            }
        }

        // Print the output list
        System.out.println(output);
    }
}

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
