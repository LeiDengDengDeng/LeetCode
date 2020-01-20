package deng.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2020/01/20
 */
public class SquaresOfASortedArrayTest {

    @Test
    public void sortedSquares1() {
        int[] A = {-4, -1, 0, 3, 10};
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, new SquaresOfASortedArray().sortedSquares(A));
    }

    @Test
    public void sortedSquares2() {
        int[] A = {-7, -3, 2, 3, 11};
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, new SquaresOfASortedArray().sortedSquares(A));
    }

    @Test
    public void sortedSquares3() {
        int[] A = {-1};
        assertArrayEquals(new int[]{1}, new SquaresOfASortedArray().sortedSquares(A));
    }
}