package mergeTwoSortsList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void mergeCheckingIfIsWork() {

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        var adding = solution.mergeTwoLists(list1,list2);

        var result = new ListNode(1,new ListNode(2));

        assertEquals(result.val,adding.val);
    }
    @Test
    void addingTwoList() {

        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = new Solution().mergeTwoLists(list1, list2);

        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        System.out.println(expected.toString());
        while (result != null && expected != null) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }


    }
}