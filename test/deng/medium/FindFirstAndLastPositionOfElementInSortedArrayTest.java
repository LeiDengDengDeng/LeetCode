package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/10
 */
public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void searchRange1() {
        assertArrayEquals(new int[]{3, 4}, new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    @Test
    public void searchRange2() {
        assertArrayEquals(new int[]{-1, -1}, new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

    @Test
    public void searchRange3() {
        assertArrayEquals(new int[]{0, 1}, new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{2, 2}, 2));
    }

    @Test
    public void searchRange4() {
        assertArrayEquals(new int[]{0, 0}, new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{1}, 1));
    }

    @Test
    public void searchRange5() {
        assertArrayEquals(new int[]{0, 0}, new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{1, 3}, 1));
    }

    @Test
    public void searchRange6() {
        assertArrayEquals(new int[]{1, 1}, new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{1, 3}, 3));
    }
}