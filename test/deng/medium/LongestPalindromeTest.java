package deng.medium;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/02/13
 */
public class LongestPalindromeTest {

    @Test
    public void longestPalindrome1() {
        assertEquals("bab", new LongestPalindrome().longestPalindrome("babc"));
    }

    @Test
    public void longestPalindrome2() {
        Set<String> answerSet = new HashSet<>();
        answerSet.add("bab");
        answerSet.add("aba");
        assertTrue(answerSet.contains(new LongestPalindrome().longestPalindrome("babac")));
    }

    @Test
    public void longestPalindrome3() {
        assertEquals("bb", new LongestPalindrome().longestPalindrome("cbbd"));
    }

    @Test
    public void longestPalindrome4() {
        assertEquals("bbb", new LongestPalindrome().longestPalindrome("cbbb"));
    }

    @Test
    public void longestPalindrome5() {
        assertEquals("anana", new LongestPalindrome().longestPalindrome("bananas"));
    }
}