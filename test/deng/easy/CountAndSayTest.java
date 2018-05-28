package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/5/29.
 */
public class CountAndSayTest {
    @Test
    public void countAndSay() throws Exception {
        CountAndSay countAndSay = new CountAndSay();

        assertEquals("111221",countAndSay.countAndSay(5));
    }

}