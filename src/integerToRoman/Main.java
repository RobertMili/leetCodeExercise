package integerToRoman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       Solution solution = new Solution();

        System.out.println(solution.intToRoman(3749));
    }
}
class Solution {
    public String intToRoman (int num) {

        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> test = new HashMap<>();
        List<Integer> exstendList = new ArrayList<>();
        String roman = "";



        String numbString = String.valueOf(num);
        var lengthNumber = numbString.length();
        int placeValue = 1;


        while (num > 0) {
            int digit = (num % 10) * placeValue;
            list.add(0, digit);
            num /= 10;
            placeValue *= 10;


        }
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < list.size(); i++) {
            int numb = list.get(i);
            for (int value : values) {
                while (numb >= value) {
                    exstendList.add(value);
                    numb -= value;
                }
            }
        }

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < exstendList.size(); i++) {
            for (int j = 0; j < values.length; j++) {
                if (exstendList.get(i) == values[j]) {
                    roman += symbols[j];
                    break;
                }
            }
        }

        return roman;
    }
}