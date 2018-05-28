package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by deng on 2018/5/28.
 */
public class ValidBracketTest {
    @Test
    public void isValid() throws Exception {
        ValidBracket validBracket = new ValidBracket();
        assertTrue(validBracket.isValid("()"));
        assertTrue(validBracket.isValid("([])"));
        assertFalse(validBracket.isValid("([)]"));
    }

}