package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/9/9.
 */
public class MySqrtTest {
    @Test
    public void mySqrt() throws Exception {
        MySqrt mySqrt = new MySqrt();
//        assertTrue(2 == mySqrt.mySqrt(8));
//        assertTrue(1 == mySqrt.mySqrt(1));
//        assertTrue(0 == mySqrt.mySqrt(0));
//        assertTrue(3 == mySqrt.mySqrt(9));
        assertTrue(1 == mySqrt.mySqrt(2));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.sqrt(2147395599));
        assertTrue((int) Math.sqrt(2147395599) == mySqrt.mySqrt(2147395599));
    }

}