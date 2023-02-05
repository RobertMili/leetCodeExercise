package addBinary;

import java.math.BigInteger;

public class Main {
}
class Solution {
    public String addBinary(String a, String b) {

        BigInteger decimalA = new BigInteger(a,2);
        BigInteger decimalB = new BigInteger(b,2);


        BigInteger sum = decimalA.add(decimalB);

        return sum.toString(2);
    }
}
