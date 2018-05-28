package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/5/28.
 */
public class LengthOfLastWordTest {
    @Test
    public void lengthOfLastWord() throws Exception {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(null));
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(" "));
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("hello world"));
    }

}