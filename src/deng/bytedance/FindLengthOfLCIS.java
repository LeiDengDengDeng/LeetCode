package deng.bytedance;

/**
 * @author deng
 * @date 2019/10/15
 */
public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length <= 1) {
            return nums.length;
        }

        int[] count = new int[nums.length];
        count[0] = 1;

        int maxLength = 1;
        for (int i = 1; i < nums.length; i++) {
            count[i] = nums[i] > nums[i - 1] ? count[i - 1] + 1 : 1;
            maxLength = Math.max(count[i], maxLength);
        }

        return maxLength;
    }
}
