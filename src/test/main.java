package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 3, 4, 4, 4, 5, 5);
        System.out.println(list);
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxNum = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxNum = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Number with highest frequency: " + maxNum);
    }
}

