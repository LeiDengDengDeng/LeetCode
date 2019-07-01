package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/06/23
 */
public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis() {
        assertEquals(0, new GenerateParentheses().generateParenthesis(0).size());
        assertEquals(1, new GenerateParentheses().generateParenthesis(1).size());
        assertEquals(5, new GenerateParentheses().generateParenthesis(3).size());
        assertEquals(14, new GenerateParentheses().generateParenthesis(4).size());

        new GenerateParentheses().generateParenthesis(6);
    }
}