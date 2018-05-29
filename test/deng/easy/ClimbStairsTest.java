package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/5/29.
 */
public class ClimbStairsTest {
    @Test
    public void climbStairs() throws Exception {
        ClimbStairs climbStairs = new ClimbStairs();

        assertEquals(3, climbStairs.climbStairs(3));
        assertEquals(5, climbStairs.climbStairs(4));
        assertEquals(8, climbStairs.climbStairs(5));
        assertEquals(13, climbStairs.climbStairs(6));
        assertEquals(14930352, climbStairs.climbStairs(35));
    }

}