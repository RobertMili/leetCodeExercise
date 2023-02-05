package mergeTwoSortsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ListNode listNode = new ListNode();

        Solution solution = new Solution();

        solution.mergeTwoLists(new ListNode(),new ListNode());
    }

}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> list = new ArrayList<>();

        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(list);



        ListNode result = null;
        ListNode current = null;

        for (Integer integer : list) {
            if (result == null) {
                result = new ListNode(integer);
                current = result;
            } else {
                current.next = new ListNode(integer);
                current = current.next;
            }
        }

        return result;
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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
