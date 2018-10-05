package deng.medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/5.
 */
public class CombinationSumTest {
    @Test
    public void combinationSum() throws Exception {
        CombinationSum sum = new CombinationSum();

        List<List<Integer>> results = sum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assertEquals(results.size(),2);

        results = sum.combinationSum(new int[]{2, 3, 5}, 8);
        assertEquals(results.size(),3);
    }

}