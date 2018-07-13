package maxProfit_122;

/**
 * Created by Jack on 2018/6/30.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int nowPriceIndex = 0;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[nowPriceIndex]){
                sum += prices[i] - prices[nowPriceIndex];
                nowPriceIndex = i;
            }else {
                nowPriceIndex = i;
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] prices= {7,1,5,3,6,4};


        int len = solution.maxProfit(prices);

        System.out.println(len);
    }
}
