package ransomeNote;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String ransomeNote = "aa";
        String magazine = "ab";

        String ransomeNote2 = "aa";
        String magazine2 = "aab";


        String ransomeNote3 = "aab";
        String magazine3 = "baa";

        System.out.println(solution.canConstruct(ransomeNote, magazine));

    }
}

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> magazineMap = new HashMap<>();

        // Fill the hashmap with characters from magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        //check if we can construct ransomeNote from magaizne
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            // If charaxte r is not in the map or there are not enough coccurencet
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }

            // Use one occurrence of the character
            magazineMap.put(c, magazineMap.get(c) - 1);
        }
        return true;
    }
}

