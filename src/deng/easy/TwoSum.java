package deng.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/description/
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
    // 复杂度O(n^2)
//    public int[] twoSum(int[] nums, int target) {
//        for (int m = 0; m < nums.length - 1; m++) {
//            for (int n = m + 1; n < nums.length; n++) {
//                int sum = nums[m] + nums[n];
//                if (sum == target) {
//                    return new int[]{m, n};
//                }
//            }
//        }
//
//        return null;
//    }

    // 复杂度O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            //可能存在一个数x,满足x*2=target，i!=map.get(nums[i])可以避免
            if (map.containsKey(nums[i]) == true && i != map.get(nums[i])) {
                a[0] = i < map.get(nums[i]) ? i : map.get(nums[i]);
                a[1] = i > map.get(nums[i]) ? i : map.get(nums[i]);
                break;
            }
        }
        return a;
    }
}
