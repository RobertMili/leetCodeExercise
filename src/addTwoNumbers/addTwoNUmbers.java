package addTwoNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addTwoNUmbers {


    public static void main(String[] args) {


       List<Integer> numberOne = new ArrayList<>();
       List<Integer> numberTwo = new ArrayList<>();

       numberOne.add(2);
       numberOne.add(4);
       numberOne.add(3);

       numberTwo.add(5);
       numberTwo.add(6);
       numberTwo.add(4);


        Solution solution = new Solution();

       // System.out.println(solution.addTwoNumbers2(numberOne, numberTwo));

        ListNode listNode = new ListNode();
        ListNode listNode2 = new ListNode();
        listNode.val = 1;
        listNode.val = 2;


        System.out.println(listNode.val);
        System.out.println(listNode2);
        new addTwoNUmbers();

    }

}
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();


        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carr = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carr;

            carr = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carr != 0) {
            curr.next = new ListNode(carr);
        }

        return dummy.next;

    }


    public int addTwoNumbers2(List<Integer> numberOne, List<Integer> numberTwo) {

        Collections.reverse(numberOne);
        Collections.reverse(numberTwo);

       int firstNumber = (numberOne.get(0) * 100) + (numberOne.get(1) * 10) + numberOne.get(2);

       int secondNUmber = (numberTwo.get(0) * 100) + (numberTwo.get(1) * 10) + numberTwo.get(2);

       int sum = firstNumber+secondNUmber;



        return sum;

    }
}



