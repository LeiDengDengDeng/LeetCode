package deng.medium;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author deng
 * @date 2019/02/19
 */
public class MaxProductTest {

    @Test
    public void maxProduct1() {
        Assert.assertEquals(6, new MaxProduct().maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void maxProduct2() {
        Assert.assertEquals(0, new MaxProduct().maxProduct(new int[]{-2, 0, -1}));
    }

    @Test
    public void maxProduct3() {
        Assert.assertEquals(24, new MaxProduct().maxProduct(new int[]{-2, 3, -4}));
    }

    @Test
    public void maxProduct4() {
        Assert.assertEquals(24, new MaxProduct().maxProduct(new int[]{2, -5, -2, -4, 3}));
    }
}