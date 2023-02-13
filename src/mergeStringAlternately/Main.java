package mergeStringAlternately;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
}

class Solution {
	public String mergeAlternately(String word1, String word2) {

		List<Character> firstWorldList = new ArrayList<>();
		List<Character> secondWorldList = new ArrayList<>();
		StringBuilder result = new StringBuilder();

		for (char c : word1.toCharArray()) {
			firstWorldList.add(c);
		}
		for (char c : word2.toCharArray()) {
			secondWorldList.add(c);
		}

		int maxLength = Math.max(word1.length(), word2.length());

		System.out.println(maxLength);

		for (int i = 0; i < maxLength; i++) {
			if (i < word1.length()) {
				result.append(word1.charAt(i));
			}
			if (i < word2.length()) {
				result.append(word2.charAt(i));
			}
		}
		return result.toString();
	}
}
