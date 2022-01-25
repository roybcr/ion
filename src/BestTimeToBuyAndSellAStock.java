/**
 * LeetCode #121
 * Best Time to Buy and Sell Stock
 *
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock,
 * and choosing a different day in the future to sell that stock.
 *
 * @param prices  The array of prices.
 * @return        The maximum profit can be achieved from this transaction.
 *                If a profit cannot by achieved, returns 0.
 */

public class BestTimeToBuyAndSellAStock {

    public int maxProfit(int[] prices) {
        int dipIdx = 0, maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < prices[dipIdx]) 
                dipIdx = i;
            else if (prices[i] - prices[dipIdx] > maxProfit) 
                maxProfit = prices[i] - prices[dipIdx];

        }
        
        return maxProfit;
    }

}
