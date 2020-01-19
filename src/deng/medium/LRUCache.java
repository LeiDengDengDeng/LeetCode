package deng.medium;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/lru-cache/
 *
 * @author deng
 * @date 2020/01/19
 */
public class LRUCache {
    private int capacity;
    private Map<Integer, Integer> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);

//        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
//            @Override
//            protected boolean removeEldestEntry(Map.Entry eldest) {
//                return map.size() > capacity;
//            }
//        };
    }

    public int get(int key) {
        Integer val = map.get(key);
        if (val != null) {
            map.remove(key);
            map.put(key, val);
            return val;
        }
        return -1;
    }

    public void put(int key, int value) {
        Integer val = map.get(key);
        if (val != null) {
            map.remove(key);
        } else if (map.size() >= capacity) {
            // delete first
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
        map.put(key, value);
    }
}
