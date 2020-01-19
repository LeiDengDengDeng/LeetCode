package deng.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2020/01/19
 */
public class LRUCacheTest {

    @Test
    public void test() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertEquals(1, cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        assertEquals(-1, cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        assertEquals(-1, cache.get(1));       // 返回 -1 (未找到)
        assertEquals(3, cache.get(3));       // 返回  3
        assertEquals(4, cache.get(4));       // 返回  4
        cache.put(4, 5);
        assertEquals(5, cache.get(4));
    }
}