package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/8/31.
 */
public class MyAtoiTest {
    @Test
    public void myAtoi() throws Exception {
        MyAtoi myAtoi = new MyAtoi();

        assertEquals( -2147483648,myAtoi.myAtoi("-6147483648"));
        assertEquals(42,myAtoi.myAtoi("42"));
        assertEquals(42,myAtoi.myAtoi("+42"));
        assertEquals(-42,myAtoi.myAtoi("    -42"));
        assertEquals(4193,myAtoi.myAtoi("4193 with words"));
        assertEquals(0,myAtoi.myAtoi("words with 4193"));
        assertEquals( -2147483648,myAtoi.myAtoi("-91283472332"));
        assertEquals( 2147483647,myAtoi.myAtoi("91283472332"));
    }

}