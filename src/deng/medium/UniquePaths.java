package deng.medium;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 * https://leetcode-cn.com/problems/unique-paths/
 * 动态规划
 *
 * @author deng
 * @date 2019/02/13
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] results = new int[m][n];
        for (int i = 0; i < m; i++) results[i][0] = 1;
        for (int i = 0; i < n; i++) results[0][i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // 只能向右或者向下，所以到达i,j处前只能到达i,j-1处或者i-1,j处
                results[i][j] = results[i][j - 1] + results[i - 1][j];
            }
        }

        return results[m - 1][n - 1];
    }
}
