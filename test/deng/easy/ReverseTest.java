package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/5/28.
 */
public class ReverseTest {
    @Test
    public void reverse() throws Exception {
        Reverse reverse = new Reverse();
        assertEquals(21,reverse.reverse(120));
        assertEquals(-123,reverse.reverse(-321));
        assertEquals(0,reverse.reverse(2099999999));
    }

}