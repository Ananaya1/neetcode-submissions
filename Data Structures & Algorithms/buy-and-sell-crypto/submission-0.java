class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int profit =0;
        int i = 1;
        while(i<prices.length)
        {
            int profit2 = prices[i]-price;
            if(prices[i]<price)
            {
                price = prices[i];
            }
            if(profit<profit2)
            {
                profit = profit2;
            }
            i++;
        }
        return profit;
    }
}