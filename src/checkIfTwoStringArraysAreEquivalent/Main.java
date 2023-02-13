package checkIfTwoStringArraysAreEquivalent;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		Solution solution = new Solution();

		String[] word1 = {"ab","c"};
		String[] word2 = {"a","bc"};

		solution.arrayStringAreEqual(word1,word2);
	}
}
class Solution {
	public boolean arrayStringAreEqual(String[] word1, String[] word2) {

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (String s: word1) {
			sb.append(s);
		}

		for (String a: word2) {
			sb2.append(a);
		}

		String word1String = sb.toString();
		String word2String = sb2.toString();

		if (word1String.equals(word2String)) {
			return true;
		}

		return false;
	}
}
