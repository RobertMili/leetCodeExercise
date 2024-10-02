package groupAnagrams;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(solution.groupAnagrams(strs));

    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String  str : strs ){

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);

            String sortedStr = new String(charArray);

           if (!anagramMap.containsKey(sortedStr)) {
               anagramMap.put(sortedStr, new ArrayList<>());
           }


           anagramMap.get(sortedStr).add(str);

        }


        return new ArrayList<>(anagramMap.values());
    }
}
