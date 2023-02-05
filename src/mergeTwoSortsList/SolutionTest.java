package mergeTwoSortsList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void mergeCheckingIfIsWork() {

        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        var adding = solution.mergeTwoLists(list1, list2);

        var result = new ListNode(1, new ListNode(2));

        assertEquals(result.val, adding.val);
    }

    @Test
    void adding4Numbers() {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);


        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(3);

        ListNode expectedResult = new ListNode(1);
        expectedResult.next = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));

        ListNode result = solution.mergeTwoLists(list1, list2);

        while (result != null) {
            assertEquals(expectedResult.val, result.val);
            expectedResult = expectedResult.next;
            result = result.next;
        }

    }


}
