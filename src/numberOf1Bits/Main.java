package numberOf1Bits;

public class Main {
}

class Solution {


  public int hammingWeight(int n) {

    String swapping = Integer.toBinaryString(n);
    int count = 0;
    for (int i = 0; i < swapping.length(); i++) {

      if (swapping.charAt(i) == '1'){
        count++;
      }
    }

    return count;
  }
}
