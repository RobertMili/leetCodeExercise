package lengthOfLastWord;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String word = "Hello World";

        solution.lenthOfLastWord(word);

    }
}

class Solution {

    public int lenthOfLastWord(String s) {
      List<String> word = new ArrayList<>();
      StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                sb.append(c);
            }
            else if (sb.length() > 0)
            {
                word.add(sb.toString());
                sb.setLength(0);

            }
        }
        if (sb.length() > 0) {
            word.add(sb.toString());
        }

       int length = word.get(word.size() - 1).length();


        return length;
    }
}
