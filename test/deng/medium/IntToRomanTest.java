package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/9/1.
 */
public class IntToRomanTest {
    @Test
    public void intToRoman() throws Exception {
        IntToRoman intToRoman = new IntToRoman();

        assertEquals("III",intToRoman.intToRoman(3));
        assertEquals("IV",intToRoman.intToRoman(4));
        assertEquals("LVIII",intToRoman.intToRoman(58));
        assertEquals("CMXCIV",intToRoman.intToRoman(994));
        assertEquals("MCMXCIV",intToRoman.intToRoman(1994));
    }

}