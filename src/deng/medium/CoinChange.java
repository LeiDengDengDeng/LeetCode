package deng.medium;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * https://leetcode-cn.com/problems/coin-change/
 *
 * @author deng
 * @date 2019/04/20
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;

        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int n = 0; n < dp[i].length; n++) {
                dp[i][n] = -1;
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int n = 1; n < dp[i].length; n++) {
                if (n < coins[i - 1]) {
                    dp[i][n] = dp[i - 1][n];
                } else if (n == coins[i - 1]) {
                    dp[i][n] = 1;
                } else {
                    if (dp[i][n - coins[i - 1]] == -1 && dp[i - 1][n] == -1) {
                        dp[i][n] = -1;
                    } else if (dp[i][n - coins[i - 1]] == -1) {
                        dp[i][n] = dp[i - 1][n];
                    } else if (dp[i - 1][n] == -1) {
                        dp[i][n] = 1 + dp[i][n - coins[i - 1]];
                    } else {
                        dp[i][n] = Math.min(1 + dp[i][n - coins[i - 1]], dp[i - 1][n]);
                    }
                }
            }
        }

        return dp[coins.length][amount];
    }
}
