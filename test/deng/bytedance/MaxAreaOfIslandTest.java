package deng.bytedance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/09/28
 */
public class MaxAreaOfIslandTest {

    @Test
    public void maxAreaOfIsland1() {
        int[][] grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        assertEquals(6, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }


    @Test
    public void maxAreaOfIsland2() {
        int[][] grid = new int[][]{
                {0, 0, 0, 0, 0, 0, 0}
        };
        assertEquals(0, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }

    @Test
    public void maxAreaOfIsland3() {
        int[][] grid = new int[][]{
                {1}
        };
        assertEquals(1, new MaxAreaOfIsland().maxAreaOfIsland(grid));
    }
}