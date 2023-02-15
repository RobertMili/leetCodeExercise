package subtractTheProductAndSumOfDigitsOfAnInteger;

public class Main {
}
class Solution {
  public int subtractProductAndSum(int n) {

    String numb = String.valueOf(n);

    int multi = 1;
    int add = 0;
    for (int i = 0; i < numb.length(); i++) {

      multi *= Integer.parseInt(String.valueOf(numb.charAt(i)));
    }

    for (int i = 0; i < numb.length(); i++) {
      add += Integer.parseInt(String.valueOf(numb.charAt(i)));
    }
    int result = multi - add;


    return result;
  }
}
