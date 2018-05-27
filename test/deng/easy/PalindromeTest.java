package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/5/27.
 */
public class PalindromeTest {
    @Test
    public void isPalindrome() throws Exception {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome(121));
        assertTrue(palindrome.isPalindrome(1));
        assertTrue(palindrome.isPalindrome(12321));
        assertFalse(palindrome.isPalindrome(12333));
        assertFalse(palindrome.isPalindrome(-123));
    }

}