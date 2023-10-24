class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            profit = prices[i] - buy;
            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
}