package medianOfTwoSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  Solution solution = new Solution();
  @Test
  void Example1(){
    int[] num1 = {1,3};
    int[] num2 = {2};

    var result = solution.findMedianSortedArrays(num1,num2);

    assertEquals(2.0000,result);
  }

  @Test
  void Example2(){
    int[] num1 = {1,2};
    int[] num2 = {3,4};

    var result = solution.findMedianSortedArrays(num1,num2);

    assertEquals(2.5,result);
  }
  @Test
  void Example3(){
    int[] num1 = {1,3};
    int[] num2 = {2,7};

    var result = solution.findMedianSortedArrays(num1,num2);

    assertEquals(2.5,result);
  }
}
