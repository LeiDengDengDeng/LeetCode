package deng.easy;

/**
 * https://leetcode-cn.com/problems/two-sum/description/
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int m = 0; m < nums.length - 1; m++) {
            for (int n = m + 1; n < nums.length; n++) {
                int sum = nums[m] + nums[n];
                if (sum == target) {
                    return new int[]{m, n};
                }
            }
        }

        return null;
    }
}
