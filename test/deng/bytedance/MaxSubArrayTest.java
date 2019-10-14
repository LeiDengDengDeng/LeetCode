package deng.bytedance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/10/15
 */
public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {
        assertEquals(6, new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}