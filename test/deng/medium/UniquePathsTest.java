package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/02/13
 */
public class UniquePathsTest {
    @Test
    public void uniquePaths1() {
        assertEquals(3, new UniquePaths().uniquePaths(3, 2));
    }

    @Test
    public void uniquePaths2() {
        assertEquals(28, new UniquePaths().uniquePaths(7, 3));
    }
}