package deng.bytedance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/10/15
 */
public class ThreeSumTest {

    @Test
    public void threeSum() {
        assertEquals(2, new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}).size());
    }
}