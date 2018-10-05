package deng.medium;

import java.util.*;

/**
 * Created by deng on 2018/10/5.
 * https://leetcode-cn.com/problems/3sum/description/
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class ThreeSum {
    // 双指针法，target为-nums[i]，保证指针left和right上的数之和为target
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> targetAndLoc = new HashMap<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            if (!targetAndLoc.containsKey(target)) {
                targetAndLoc.put(target, i);
            }
        }

        List<List<Integer>> results = new ArrayList<>();
        for (int target : targetAndLoc.keySet()) {
            int loc = targetAndLoc.get(target); // 指针起点

            int left = loc + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] < target) {
                    left++;
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[loc]);
                    result.add(nums[left]);
                    result.add(nums[right]);

                    do {
                        left++;
                    } while (left < right && nums[left] == nums[left - 1]);
                    results.add(result);
                }
            }
        }
        return results;
    }


    // timeout的回溯
    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        loop(results, nums, 0, 0, new ArrayList<>());
        return results;
    }

    public void loop(List<List<Integer>> results, int[] nums, int index, int target, List<Integer> result) {
        if (target == 0 && result.size() == 3) {
            for (List<Integer> existedRes : results) {
                if (existedRes.containsAll(result) && result.containsAll(existedRes)) {
                    return;
                }
            }
            results.add(new ArrayList<>(result));
            return;
        } else if (result.size() > 3 || index == nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            result.add(nums[i]);
            loop(results, nums, i + 1, target + nums[i], result);
            result.remove(result.size() - 1);
        }
    }
}
