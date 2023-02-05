package addString;

import java.math.BigInteger;

public class Main {
}

class Solution {
    public String addString (String num1, String num2 ){
        BigInteger numOne = new BigInteger(num1);
        BigInteger numTwo = new BigInteger(num2);

        BigInteger c = numOne.add(numTwo);

        String result = c.toString();


        return result;

    }
}
