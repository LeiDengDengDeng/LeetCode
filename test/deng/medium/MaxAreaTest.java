package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/4.
 */
public class MaxAreaTest {
    @Test
    public void maxArea() throws Exception {
        MaxArea maxArea = new MaxArea();
        assertEquals(49, maxArea.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

}