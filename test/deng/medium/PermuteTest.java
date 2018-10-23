package deng.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/9/3.
 */
public class PermuteTest {
    @Test
    public void permute() throws Exception {
        Permute solution = new Permute();
        List<List<Integer>> result = solution.permute(new int[]{1, 2, 3});
        assertTrue(result.size() == 6);
    }

}