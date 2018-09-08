package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/9/8.
 */
public class RemoveElementTest {
    @Test
    public void removeElement() throws Exception {
        RemoveElement solution = new RemoveElement();
        assertEquals(5, solution.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
        assertEquals(0, solution.removeElement(new int[]{3, 3}, 3));
    }

}