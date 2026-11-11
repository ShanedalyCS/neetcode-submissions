class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; 
        int right = 1;

        //set a base min buy, and a base sale value 

        int buyPrice = prices[0];
        int salePrice =  0; 
        int profit = 0; 

        Boolean sell = false;

        for(int i = 0; i < prices.length; i++)
        {
            int tempProfit = 0;

            System.out.println("BUY : " + buyPrice);
            System.out.println("SELL : " + salePrice);
            if(prices[left] < buyPrice) 
            {
                buyPrice = prices[left];
                
                if(left+1 != prices.length) salePrice = prices[right];   
                else return 0;
            }
            if(right != prices.length && prices[right] > salePrice) salePrice = prices[right];

            if(!(right + 1 == prices.length))
            {
                right++;
                left++;
            }
            tempProfit = salePrice - buyPrice;

            if(tempProfit > profit) profit = tempProfit;

        }
        return profit;
    }
}
