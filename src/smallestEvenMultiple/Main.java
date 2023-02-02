package smallestEvenMultiple;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int n = 3;

        System.out.println(solution.smallestEvenMultiple(n));

    }

}
class Solution {
    public int smallestEvenMultiple(int n) {
        if ( n % 2 == 0){
            return n = n * 1;
        }
        return  n = n * 2;
    }
}