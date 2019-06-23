package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/06/23
 */
public class ZigzagConversionTest {

    @Test
    public void convert1() {
        assertEquals("LCIRETOESIIGEDHN", new ZigzagConversion().convert("LEETCODEISHIRING", 3));
    }

    @Test
    public void convert2() {
        assertEquals("LDREOEIIECIHNTSG", new ZigzagConversion().convert("LEETCODEISHIRING", 4));
    }
}