package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/8/28.
 */
public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flight", "flow"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"cat", "racecar", "car"}));
        assertEquals("cat", solution.longestCommonPrefix(new String[]{"cat", "cat"}));
        assertEquals("cat", solution.longestCommonPrefix(new String[]{"cat", "catcat"}));
        assertEquals("d", solution.longestCommonPrefix(new String[]{"d"}));
    }

}