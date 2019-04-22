package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/20
 */
public class CoinChangeTest {

    @Test
    public void coinChange1() {
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void coinChange2() {
        assertEquals(-1, new CoinChange().coinChange(new int[]{2, 5}, 3));
    }

    @Test
    public void coinChange3() {
        assertEquals(0, new CoinChange().coinChange(new int[]{2, 5}, 0));
    }

    @Test
    public void coinChange4() {
        assertEquals(4, new CoinChange().coinChange(new int[]{2, 5, 10, 1}, 27));
    }

    @Test
    public void coinChange5() {
        assertEquals(20, new CoinChange().coinChange(new int[]{186, 419, 83, 408}, 6249));
    }
}