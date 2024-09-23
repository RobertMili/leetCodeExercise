package majorityElement;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[]nb = {3,3,4};

        solution.majoirtyEkeemnte(nb);
    }

}
class Solution {
    public int majoirtyEkeemnte (int[] nums) {
        // Step 1: Use a HashMap to count the occurrences of each element
        HashMap<Integer, Integer> counting = new HashMap<>();
        for (int num : nums) {
            counting.put(num, counting.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert the HashMap entries to a list
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(counting.entrySet());

        // Step 3: Sort the list in reverse order based on the values
        entryList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        // Step 4: Print the sorted entries
        entryList.forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

        // Step 5: Get the key with the highest value
        int number = entryList.get(0).getKey();

        System.out.println("Key with highest value: " + number);

        return number;
    }
}

