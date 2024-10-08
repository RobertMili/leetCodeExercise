package linkedListCycle;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        // Create the linked list: [3, 2, 0, -4]
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        // Create the cycle: last node (-4) points to the second node (2)
        fourth.next = second; // Cycle at position 1

        // Instantiate Solution class and check for cycle

        boolean hasCycle = solution.hasCycle(head);

        // Print result
        System.out.println("Cycle detected: " + hasCycle);

    }
}

class Solution{
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        var fast= head.next;
        var slow = head.next.next;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }


        return false;
    }
}


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
