package deng.easy;

/**
 * https://leetcode-cn.com/problems/max-consecutive-ones/
 * 给定一个二进制数组， 计算其中最大连续1的个数。
 *
 * @author deng
 * @date 2021/02/15
 */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) return 0;

        int maxOnes = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] * nums[i] > 0 ? nums[i - 1] + 1 : nums[i];
            maxOnes = Math.max(maxOnes, nums[i]);
        }
        return maxOnes;
    }
}
