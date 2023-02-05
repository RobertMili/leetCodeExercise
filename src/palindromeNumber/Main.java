package palindromeNumber;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
//        solution.countDigit(1212);

    }
}

class Solution {
    public boolean isPalindrome(int x) {
        int lastDigit = 0;
        int sum = 0;
        int firstDigit = x;

        while (x > 0) {
            lastDigit = x % 10;
            sum = (sum * 10) + lastDigit;
            x = x / 10;
        }

        if (firstDigit == sum) {
            return true;
        }
        return false;
    }
}

//        if (x < 0) {
//            return false;
//        } else {
//
//
//
//            for (int i = 0; i <= 9; i++) {
//                if (x == i) {
//                    return true;
//                }
//            }
//                if (x == 10) {
//                    return false;
//                }


//    private static boolean compare(int lastDigit, int firstDigit) {
//        if (firstDigit == lastDigit) {
//            return true;
//        }
//        return false;
//    }
//
//    public int countDigit (int n){
//    int count = 0;
//    while ( n != 0){
//        n = n / 10;
//        count = count + 1;
//    }
//        return count;
//
//    }


