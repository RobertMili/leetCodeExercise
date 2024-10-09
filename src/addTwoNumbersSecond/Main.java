package addTwoNumbersSecond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create the linked list l1: [2, 4, 3]
        int[] values1 = {2, 4, 3};
        ListNode l1 = new ListNode(values1[0]);
        ListNode current1 = l1;
        for (int i = 1; i < values1.length; i++) {
            current1.next = new ListNode(values1[i]);
            current1 = current1.next;
        }

        // Create the linked list l2: [5, 6, 4]
        int[] values2 = {5, 6, 4};
        ListNode l2 = new ListNode(values2[0]);
        ListNode current2 = l2;
        for (int i = 1; i < values2.length; i++) {
            current2.next = new ListNode(values2[i]);
            current2 = current2.next;
        }

        // Instantiate Solution class and add the two numbers
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }

//testing
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        ListNode ptr = result;
        int carry = 0;

        while (l1 != null || l2 != null) {

            int sum = 0 + carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2  != null) {
                sum += l2.val;
                l2 = l2.next;
            }


            carry  = sum / 10;
            sum = sum % 10;
            ptr.next =new ListNode(sum);
            ptr = ptr.next;

        }

        if ( carry == 1) ptr.next = new ListNode(1);


        return result.next;

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}