package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/8/28.
 */
public class PlusOneTest {
    @Test
    public void plusOne() throws Exception {
        PlusOne solution = new PlusOne();
        assertArrayEquals(new int[]{1, 0, 0}, solution.plusOne(new int[]{9, 9}));
        assertArrayEquals(new int[]{1, 0, 1}, solution.plusOne(new int[]{1, 0, 0}));
    }

}