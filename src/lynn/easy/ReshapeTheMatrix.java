package lynn.easy;

import java.util.Arrays;

/**
 * Created by liying on 2018/11/7.
 */
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (!(nums.length * nums[0].length == r * c)) {
            return nums;
        }
        int i = 0;
        int j = 0;
        int[][] res = new int[r][c];
        for (int[] numCol : nums) {
            for (int num : numCol) {
                if (j > c - 1) {
                    j = 0;
                    i++;
                }
                res[i][j] = num;
                j++;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] nums = {{1, 2}, {3, 4}};
        int[][] res = reshapeTheMatrix.matrixReshape(nums, 1, 4);
    }

    /**
     * M[i][j]=M[n*i+j] , where n is the number of cols.
     * This is the one way of converting 2-d indices into one 1-d index.
     *
     * M[i] => M[n/i][n%i] Will it result in right mapping
     */
}
