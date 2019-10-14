package deng.bytedance;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author deng
 * @date 2019/10/14
 */
public class MaxProfit2Test {
    @Test
    public void maxProfit1() {
        Assert.assertEquals(7, new MaxProfit2().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void maxProfit2() {
        Assert.assertEquals(0, new MaxProfit2().maxProfit(new int[]{7}));
    }

    @Test
    public void maxProfit3() {
        Assert.assertEquals(4, new MaxProfit2().maxProfit(new int[]{1, 2, 3, 4, 5}));
    }
}