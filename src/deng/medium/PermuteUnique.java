package deng.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by deng on 2018/9/8.
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * https://leetcode-cn.com/problems/permutations-ii/description/
 */
public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 本来想用String直接转换成List<Integer>，后来发现测试用例有负数...
        Set<String> resultSet = new HashSet<>();
        permute(result, resultSet, nums, 0);
        return result;
    }

    /**
     * @param result    存放结果
     * @param resultStr 用String的形式表示nums，用于判断重复
     * @param nums
     * @param s
     */
    private void permute(List<List<Integer>> result, Set<String> resultStr, int[] nums, int s) {
        if (s == nums.length) {
            List<Integer> numList = new ArrayList<>();
            StringBuilder numStr = new StringBuilder();
            for (int num : nums) {
                numList.add(num);
                numStr.append(num);
            }
            if (!resultStr.contains(numStr.toString())) {
                result.add(numList);
                resultStr.add(numStr.toString());
            }
        }

        for (int i = s; i < nums.length; i++) {
            // 减少递归次数，如果两个数相等，没必要继续递归，肯定会重复
            if (s != i && nums[s] == nums[i]) {
                continue;
            }
            swap(nums, s, i);
            permute(result, resultStr, nums, s + 1);
            swap(nums, s, i);
        }
    }

    private void swap(int[] nums, int loc1, int loc2) {
        int index = nums[loc1];
        nums[loc1] = nums[loc2];
        nums[loc2] = index;
    }
}
