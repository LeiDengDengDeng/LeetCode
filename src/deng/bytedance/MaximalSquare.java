package deng.bytedance;

/**
 * https://leetcode-cn.com/explore/interview/card/bytedance/246/dynamic-programming-or-greedy/1028/
 *
 * @author deng
 * @date 2019/10/14
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int[][] res = new int[matrix.length][matrix[0].length];

        int maxArea = 0;
        // 初始化第一行和第一列
        for (int i = 0; i < matrix.length; i++) {
            res[i][0] = matrix[i][0] - '0';
            maxArea = (res[i][0] | maxArea) * 1;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            res[0][i] = matrix[0][i] - '0';
            maxArea = (res[0][i] | maxArea) * 1;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != '0') {
                    // 上、左、左上的最小值
                    int min = Math.min(Math.min(res[i][j - 1], res[i - 1][j]), res[i - 1][j - 1]);
                    res[i][j] = min == 0 ? 1 : (int) Math.pow((int) Math.pow(min, 0.5) + 1, 2);

                    maxArea = Math.max(res[i][j], maxArea);
                }
            }
        }

        return maxArea;
    }
}
