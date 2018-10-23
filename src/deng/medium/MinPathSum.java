package deng.medium;

/**
 * Created by deng on 2018/10/3.
 * https://leetcode-cn.com/problems/minimum-path-sum/description/
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int[][] results = new int[grid.length][grid[0].length]; // results[m][n]代表从grid[0][0]到grid[m][n]的最小总和
        results[0][0] = grid[0][0];

        // 初始化第一行
        for (int i = 1; i < results[0].length; i++) {
            results[0][i] = results[0][i - 1] + grid[0][i];
        }
        // 初始化第一列
        for (int i = 1; i < results.length; i++) {
            results[i][0] = results[i - 1][0] + grid[i][0];
        }

        for (int m = 1; m < results.length; m++) {
            for (int n = 1; n < results[0].length; n++) {
                int way1 = results[m - 1][n] + grid[m][n]; // 右移
                int way2 = results[m][n - 1] + grid[m][n]; // 下移
                results[m][n] = Math.min(way1, way2); // 与子问题的联系：挪动一步，只能从上面下移一步或者从左面右移一步
            }
        }

        return results[grid.length - 1][grid[0].length - 1];
    }
}
