package bestTimeToBuyAndSellStock;

import java.util.ArrayList;
import java.util.List;

public class bestTimeToBuyAndSellStock {
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

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        System.out.println(maxProfit);

        return maxProfit;
    }
}

