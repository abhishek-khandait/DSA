class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int buy = prices[0];
        for(int i = 1 ; i<prices.length; i++){

            if(prices[i]<buy){
                buy = prices[i];
            }

            int current_profit = prices[i] - buy;
            if(current_profit>max_profit){
                max_profit = current_profit;
            }
        }
        return max_profit;


    }
}