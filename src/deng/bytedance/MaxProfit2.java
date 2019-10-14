package deng.bytedance;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/246/dynamic-programming-or-greedy/1043/
 *
 * @author deng
 * @date 2019/10/14
 */
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // 0代表第i天不持有股票,1代表持有股票
        int[][] profit = new int[prices.length][2];
        profit[0][0] = 0;
        profit[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            profit[i][0] = Math.max(profit[i - 1][0], profit[i - 1][1] + prices[i]);
            profit[i][1] = Math.max(profit[i - 1][1], profit[i - 1][0] - prices[i]);
        }

        return profit[profit.length - 1][0];
    }
}
