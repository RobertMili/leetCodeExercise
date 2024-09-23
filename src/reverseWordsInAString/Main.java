package reverseWordsInAString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "the sky is blue";

        System.out.println(solution.reverseWord(s));
    }
}
class Solution {
    public String reverseWord (String s) {
        List<String> words = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        List<String> reversedWord = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {
            char characters = s.charAt(i);

            if (characters != ' ') {
                sb.append(characters);
            }
            else if (sb.length() > 0) {
                words.add(sb.toString());
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            words.add(sb.toString());
        }

        for (int i = words.size() - 1; i >= 0; i--) {
            reversedWord.add(words.get(i));
        }

        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < reversedWord.size(); i++) {
            sb2.append(reversedWord.get(i)).append(" ");
        }
        s = sb2.toString().trim();


        return s;
    }
}
