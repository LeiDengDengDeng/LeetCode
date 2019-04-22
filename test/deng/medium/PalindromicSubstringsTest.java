package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * https://leetcode-cn.com/problems/palindromic-substrings/
 *
 * @author deng
 * @date 2019/04/20
 */
public class PalindromicSubstringsTest {

    @Test
    public void countSubstrings1() {
        assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
    }

    @Test
    public void countSubstrings2() {
        assertEquals(7, new PalindromicSubstrings().countSubstrings("cabba"));
    }

    @Test
    public void countSubstrings3() {
        String input = "dnncbwoneinoplypwgbwktmvkoimcooyiwirgbxlcttgteqthcvyoueyftiwgwwxvxvg";
        assertEquals(77, new PalindromicSubstrings().countSubstrings(input));
    }
}