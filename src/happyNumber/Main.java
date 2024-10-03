package happyNumber;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 19;

        System.out.println(solution.isHappy(n));
    }
}
class Solution {
    public boolean isHappy (int n) {
        HashSet<Integer>  set = new HashSet<>();

        while (n != 1) {
            int sum = 0;

            while (n != 0) {
                int digit = n % 10;

                sum += digit * digit;
                n /= 10;
            }

            if (set.contains(sum)) {
                return false;
            }
            set.add(sum);
            n = sum;
        }

        System.out.println(set);


        return true;
    }
}
