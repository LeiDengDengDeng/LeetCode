package deng.medium;

/**
 * https://leetcode-cn.com/problems/next-permutation/
 *
 * @author deng
 * @date 2020/08/07
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int loc = -1;
        // 找到最后一个先升后降的拐点
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                loc = i - 1;
                break;
            }
        }

        if (loc != -1) {
            for (int i = nums.length - 1; i > loc; i--) {
                if (nums[i] > nums[loc]) {
                    swap(nums, i, loc);
                    break;
                }
            }
        }

        // 降序转升序
        for (int i = loc + 1; i < (nums.length + loc + 1) / 2; i++) {
            swap(nums, i, nums.length - 1 - (i - loc - 1));
        }
    }


    public void swap(int[] nums, int i, int j) {
        int index = nums[i];
        nums[i] = nums[j];
        nums[j] = index;
    }

}
