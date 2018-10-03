package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/3.
 */
public class MinPathSumTest {
    @Test
    public void minPathSum1() throws Exception {
        MinPathSum minPathSum = new MinPathSum();
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        assertEquals(7, minPathSum.minPathSum(grid));
    }

    @Test
    public void minPathSum2() throws Exception {
        MinPathSum minPathSum = new MinPathSum();
        int[][] grid = new int[][]{
                {0, 1},
                {1, 0}
        };
        assertEquals(1, minPathSum.minPathSum(grid));
    }
}