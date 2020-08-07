package deng.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author deng
 * @date 2020/08/07
 */
public class NextPermutationTest {
    @Test
    public void nextPermutation1() {
        int[] input = new int[]{1, 5, 3, 6, 4, 2};
        new NextPermutation().nextPermutation(input);
        assertArrayEquals(new int[]{1, 5, 4, 2, 3, 6}, input);
    }

    @Test
    public void nextPermutation2() {
        int[] input = new int[]{3, 2, 1};
        new NextPermutation().nextPermutation(input);
        assertArrayEquals(new int[]{1, 2, 3}, input);
    }
}