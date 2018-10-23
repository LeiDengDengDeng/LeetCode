package deng.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by deng on 2018/10/6.
 * https://leetcode-cn.com/problems/4sum/description/
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * 注意：
 * 答案中不可以包含重复的四元组。
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                for (int left = j + 1; left < nums.length - 1; left++) {
                    int right = nums.length - 1;
                    while (left < right) {
                        int sum = nums[i] + nums[j] + nums[left] + nums[right];
                        if (sum < target) {
                            left++;
                        } else if (sum > target) {
                            right--;
                        } else {
                            List<Integer> result = new ArrayList<>();
                            result.add(nums[i]);
                            result.add(nums[j]);
                            result.add(nums[left]);
                            result.add(nums[right]);
                            results.add(result);

                            do {
                                left++;
                            } while (left < right && nums[left - 1] == nums[left]);
                        }
                    }
                }
            }
        }
        return results;
    }
}
