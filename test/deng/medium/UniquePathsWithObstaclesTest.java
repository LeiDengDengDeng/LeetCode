package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/02/13
 */
public class UniquePathsWithObstaclesTest {

    @Test
    public void uniquePathsWithObstacles1() {
        int[][] grid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        assertEquals(2, new UniquePathsWithObstacles().uniquePathsWithObstacles(grid));
    }

    @Test
    public void uniquePathsWithObstacles2() {
        int[][] grid = {
                {1, 0},
        };

        assertEquals(0, new UniquePathsWithObstacles().uniquePathsWithObstacles(grid));
    }
}