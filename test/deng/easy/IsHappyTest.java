package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/9/9.
 */
public class IsHappyTest {
    @Test
    public void isHappy() throws Exception {
        IsHappy isHappy = new IsHappy();
        assertTrue(isHappy.isHappy(19));
        assertTrue(isHappy.isHappy(1));
        assertFalse(isHappy.isHappy(18));
        assertFalse(isHappy.isHappy(0));
    }

}