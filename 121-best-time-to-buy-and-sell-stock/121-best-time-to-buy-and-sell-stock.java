public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int element : prices) {
            if (element  < minprice)
                minprice = element ;
            else if (element  - minprice > maxprofit)
                maxprofit = element - minprice;
        }
        return maxprofit;
    }
}