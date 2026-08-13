// Last updated: 13/08/2026, 09:21:59
class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        if(n ==0){
            return 0;
        }
        int profit =0;
        int min = prices[0];
        for(int i =1;i<n;i++){
            
            profit =  Math.max(profit,prices[i] - min);
            min = Math.min(min,prices[i]); 
        }

            
        return profit;
    }
}