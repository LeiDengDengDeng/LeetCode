package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/9/9.
 */
public class RemoveDuplicatesTest {
    @Test
    public void removeDuplicates() throws Exception {
        RemoveDuplicates solution = new RemoveDuplicates();

        assertEquals(1, solution.removeDuplicates(new int[]{0, 0}));
        assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

}