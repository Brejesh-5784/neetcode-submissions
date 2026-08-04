class Solution {
    public int maxProfit(int[] prices) {
        int cp = 0 ;
        int sp = 1 ;
        int max_profit = 0 ;

        while(sp < prices.length){
            if(prices[cp] < prices[sp]){
                int profit =  prices[sp] - prices[cp] ;
                max_profit = Math.max(max_profit , profit);
            }
            else{
                cp = sp ;
            }
            sp ++ ; 
        }
        return max_profit; 
        
        
    }
}
