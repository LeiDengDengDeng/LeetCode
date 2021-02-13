package deng.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * @author deng
 * @date 2021/02/13
 */
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] bitMap = new int[nums.length + 1];
        for (int i : nums) {
            bitMap[i] = 1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < bitMap.length; i++) {
            if (bitMap[i] == 0) {
                res.add(i);
            }
        }
        return res;
    }
}
