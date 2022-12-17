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



    }

}
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();

        List<Integer> test = new ArrayList<>();

        test.add(l1.val);

        test.forEach(System.out::println);

        return result;

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



