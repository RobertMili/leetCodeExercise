package romanToInteger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

            Solution solution = new Solution();

            System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
class Solution {
    public int romanToInt(String s) {
        int resultat = 0;

        Map<Character,Integer> test = new HashMap<>();


        test.put('I',1);
        test.put('V',5);
        test.put('X',10);
        test.put('L',50);
        test.put('C',100);
        test.put('D',500);
        test.put('M',1000);

        for (int i = 0; i < s.length() - 1; i++) {

            char first = s.charAt(i);
            char second = s.charAt(i+1);
            if (test.get(first) < test.get(second)){

                resultat = resultat - test.get(first);
            }else {
                resultat = resultat + test.get(first);
            }
        }
        resultat = resultat + test.get(s.charAt(s.length() - 1));
        /*
            Input: s = "MCMXCIV"
            Output: 1994
            Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
       */

        return resultat;

    }
}