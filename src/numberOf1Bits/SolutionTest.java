package numberOf1Bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  Solution solution = new Solution();

  @Test
  void Example1(){
    int n = 0001011;

    var result = solution.hammingWeight(n);

    assertEquals(3,result);
  }
}
