package deng.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by deng on 2018/10/5.
 */
public class ThreeSumTest {
    @Test
    public void threeSum() throws Exception {
        ThreeSum threeSum = new ThreeSum();

        List<List<Integer>> results = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertEquals(results.size(), 2);

        results = threeSum.threeSum(new int[]{-1, 0, 0, -1, 0});
        assertEquals(results.size(), 1);

        results = threeSum.threeSum(new int[]{0, 1, 1});
        assertEquals(results.size(), 0);


        results = threeSum.threeSum(new int[]{1, 2, -2, -1});
        assertEquals(results.size(), 0);

        results = threeSum.threeSum(new int[]{-1, 0, 1, 0, -1, 0});
        assertEquals(results.size(), 2);
    }

}