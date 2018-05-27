package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/5/28.
 */
public class RomanTest {
    @Test
    public void romanToInt() throws Exception {
        Roman roman = new Roman();
        assertEquals(1994,roman.romanToInt("MCMXCIV"));
    }

}