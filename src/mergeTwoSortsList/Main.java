package mergeTwoSortsList;

public class Main {

    public static void main(String[] args) {


        ListNode listNode = new ListNode();

        Solution solution = new Solution();

        solution.mergeTwoLists(new ListNode(),new ListNode());
    }

}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode listNode = new ListNode();
        

        return null;
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
