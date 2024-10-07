package ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.MyStack();
    }
}

class Solution {
    private Queue<Integer> queue;


    public void MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {

        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
    }
    public int pop() {

        return queue.remove();
    }

    public int top() {

        return queue.peek();
    }

    public boolean empty() {

        return queue.isEmpty();
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */