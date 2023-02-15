package subtractTheProductAndSumOfDigitsOfAnInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  Solution solution = new Solution();
  @Test
  void Example1() {
    int n = 234;

    var result = solution.subtractProductAndSum(n);

    assertEquals(15,result);
  }

}
