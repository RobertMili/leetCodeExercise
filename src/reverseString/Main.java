package reverseString;

public class Main {
	public static void main(String[] args) {
		Solution solution = new Solution();

		char[] test = {'h', 'e', 'l', 'l', 'o'};
		solution.reverseString(test);
	}
}

class Solution {
	public void reverseString(char[] s) {


		int left = 0;
		int right = s.length - 1;


		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}

		System.out.print("[");
		for (int i = 0; i < s.length; i++) {
			System.out.print("'" + s[i] + "', ");
		}
		System.out.print("\b\b]");
	}
}
