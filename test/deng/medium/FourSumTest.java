package deng.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/6.
 */
public class FourSumTest {
    @Test
    public void fourSum() throws Exception {
        FourSum sum = new FourSum();

        List<List<Integer>> results = sum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertEquals(results.size(), 3);

        results = sum.fourSum(new int[]{2, 1, 0, -1}, 2);
        assertEquals(results.size(), 1);

        results = sum.fourSum(new int[]{-3, -2, -1, 0, 0, 1, 2, 3}, 0);
        assertEquals(results.size(), 8);
    }

}