class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxsum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];

            int profit = prices[i] - min;
            maxsum = Math.max(profit, maxsum);
        }
        if (maxsum < 0)
            return 0;
        else
            return maxsum;

    }
}