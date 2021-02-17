package deng.easy;

/**
 * https://leetcode-cn.com/problems/reshape-the-matrix/
 *
 * @author deng
 * @date 2021/02/17
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null || r * c != nums.length * nums[0].length) return nums;

        int[][] res = new int[r][c];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int total = i * nums[i].length + j;
                res[total / c][total % c] = nums[i][j];
            }
        }
        return res;
    }
}
