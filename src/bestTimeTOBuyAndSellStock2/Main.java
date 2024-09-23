package bestTimeTOBuyAndSellStock2;

public class Main {
    public static void main(String[] args) {
      Solution solution = new Solution();
        int[] nb = {7, 1, 5, 3, 6, 4};
        solution.maxProfit(nb);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices == null) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int second  = i+1;

            System.out.println("second number " + second);
            if (prices[i] < prices[second]) {
                    System.out.println("F " + prices[i]);
                    System.out.println("S " + prices[second]);
                    maxProfit += prices[second] - prices[i];
                }
            }


        System.out.println(maxProfit);

        return maxProfit;
    }
}
