package deng.bytedance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/10/15
 */
public class FindLengthOfLCISTest {

    @Test
    public void findLengthOfLCIS1() {
        assertEquals(3, new FindLengthOfLCIS().findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    public void findLengthOfLCIS2() {
        assertEquals(1, new FindLengthOfLCIS().findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }
}