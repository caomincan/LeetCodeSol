package Leetcode;

public class BuyAndSell {
	public int maxProfit(int[] prices) {
        int diff = 0;
        int tmp = 0;
        int result = 0;
        for(int i=0;i<prices.length-1;i++){
            diff = prices[i+1]-prices[i];
            if(diff>0) tmp+=diff;
            else if(diff<0){
                if(tmp+diff >=0) tmp+=diff;
                else tmp = 0;
            }
            if(tmp > result) result = tmp;
        }
        return result;
    }
}
