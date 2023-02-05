package addToArrayFOrmOfIngeter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] num = {1,2,0,0};
        int count = 34;

        System.out.println(solution.addToArrayForm(num, count));

    }
}

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer> result = new ArrayList<>();

       int i = num.length - 1;
       while (i >= 0 || k > 0) {
           if ( i >= 0) {
               k += num[i];
           }


           result.add(k % 10);
           k /= 10;
           i--;
       }
        Collections.reverse(result);

       return result;
    }
}

/*
  List<Integer> integerList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int number = 0;

        for (int i : num){
            sb.append(i);
        }

        number = Integer.parseInt(String.valueOf(sb));
        number += k;

        char[] charArray = Integer.toString(number).toCharArray();

        for (char c : charArray){
            integerList.add(Character.getNumericValue(c));
        }



        return integerList;
 */