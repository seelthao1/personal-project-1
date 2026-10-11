package two_pointers;
/**
 * LeetCode Problem: Best Time to Buy and Sell Stock
 * Description: Given an array prices where prices[i] is the price of a given stock on the ith day, find the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for(int i =1; i <prices.length; i++){
            int currentProfit = prices[i] - minPrice;
            if(currentProfit > profit){
                profit = currentProfit;
            }

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
        return profit;
    }
}
