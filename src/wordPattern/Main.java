package wordPattern;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String pattern = "abba";
        String s = "dog cat cat dog";

        String pattern2 = "abba";
        String s2 = "dog cat cat fish";

        String pattern3 = "aaa";
        String s3 = "aa aa aa aa";



//        System.out.println(solution.wordPattern(pattern, s));
        System.out.println(solution.wordPattern(pattern3, s3));
    }
}
class Solution {
    public boolean wordPattern (String pattern, String s) {
        Map<Character, String> mapping = new LinkedHashMap<>();
        List<String> words = new ArrayList<>();
        Set<String> mappedValues = new HashSet<>();

        words = Arrays.stream(s.split(" "))
                .map(String::trim)
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());



        if (pattern.length() != words.size()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {

            char orginal = pattern.charAt(i);
            String replacment = words.get(i);


            System.out.println(mappedValues);
            if (!mapping.containsKey(orginal)) {
                if (mappedValues.contains(replacment)){
                    return false;
                }
                mapping.put(orginal,replacment);
                mappedValues.add(replacment);
            }
             else {
                String mappedCharacter = mapping.get(orginal);
    //                System.out.println("mapped character -> " + mappedCharacter);
    //                System.out.println("replacment  -> " + replacment);
                if (!mappedCharacter.toString().equals(replacment.toString())) {
                    System.out.println("here came");
                     return false;
                 }
            }
        }




        return true;


    }
}

