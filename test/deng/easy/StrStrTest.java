package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/8/28.
 */
public class StrStrTest {
    @Test
    public void strStr() throws Exception {
        StrStr solution = new StrStr();
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(-1, solution.strStr("bbbba", "aa"));
        assertEquals(0, solution.strStr("abc", "abc"));
        assertEquals(0, solution.strStr("a", ""));
    }

}