package deng.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/10/4.
 */
public class NumDecodingsTest {
    @Test
    public void numDecodings() throws Exception {
        NumDecodings numDecodings = new NumDecodings();

        assertEquals(3, numDecodings.numDecodings("226"));
        assertEquals(2, numDecodings.numDecodings("12"));
        assertEquals(1, numDecodings.numDecodings("101"));
        assertEquals(1, numDecodings.numDecodings("110"));
    }
}