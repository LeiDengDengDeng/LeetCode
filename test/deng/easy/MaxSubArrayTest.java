package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/3.
 */
public class MaxSubArrayTest {
    @Test
    public void maxSubArray() throws Exception {
        MaxSubArray maxSubArray = new MaxSubArray();
        assertEquals(maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), 6);
        assertEquals(maxSubArray.maxSubArray(new int[]{1}), 1);
    }
}