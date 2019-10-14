package deng.bytedance;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/10/15
 */
public class MaximalSquareTest {

    @Test
    public void maximalSquare1() {
        char[][] matrix = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };

        Assert.assertEquals(4, new MaximalSquare().maximalSquare(matrix));
    }


    @Test
    public void maximalSquare2() {
        char[][] matrix = new char[][]{{'1'}};
        Assert.assertEquals(1, new MaximalSquare().maximalSquare(matrix));
    }
}