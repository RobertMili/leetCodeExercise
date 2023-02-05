package longerstCommonPrefix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] input = {"ab", "a"};


        System.out.println(solution.longestCommonPrefix(input));

    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {

        for (String s : strs) {
            System.out.println(s);
        }

        char firstLetter;
        char secondLetter;
        char thirdLetter;
        String firstLetterComparing = "";
        String sumLetter = "";


        if (strs.length == 0 || strs == null) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs[0].length(); i++) {
            firstLetter = strs[0].charAt(i);


            int k = 0;
            for (int j = 0; j < strs[1].length(); j++) {

                secondLetter = strs[1].charAt(k);


                if (firstLetter == secondLetter) {
                    firstLetterComparing += firstLetter;

                    if (strs[2] != null) {
                        thirdLetter = strs[2].charAt(i);

                        if (thirdLetter == firstLetterComparing.charAt(i)) {
                            sumLetter += thirdLetter;
                        }
                    } else if (strs[2].length() == 0){
                        return firstLetterComparing;
                    }

                }
                k++;
            }
        }
        return sumLetter;
    }

    public String leetCodeSolution(String[] strs){

        if (strs == null || strs.length == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length && i < last.length; i++) {

            if (first[i] == last[i]){
                result.append(first[i]);
            }
            else
                return result.toString();
        }
        return result.toString();
    }
}

/*
    for (int i = 0; i < strs[0].length() - 2; i++) {

                firstLetter = String.valueOf(strs[0].charAt(i));
                secondLetter = String.valueOf(strs[1].charAt(i));

                if (firstLetter.equals(secondLetter)) {
                    firstLetterComparing += firstLetter;

                    for (int j = 0; j < firstLetterComparing.length(); j++) {
                        for (int k = 0; k < strs[2].length(); k++) {

                            char first = firstLetterComparing.charAt(j);
                            char thirdLetter = strs[2].charAt(k);


                            if (first == thirdLetter) {
                                sumLetter += first;

                            }
                        }
                    }
                }
            }

 */
