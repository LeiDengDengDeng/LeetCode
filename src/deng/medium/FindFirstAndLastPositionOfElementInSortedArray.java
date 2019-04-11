package deng.medium;

/**
 * @author deng
 * @date 2019/04/09
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{-1, -1};

        // 二分查找
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;

            if (nums[mid] == target) {
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (left > right) {
            return new int[]{-1, -1};
        } else {
            int leftBound = mid;
            while (leftBound >= 0 && nums[leftBound] == target) {
                leftBound--;
            }
            if (leftBound == -1 || (leftBound >= 0 && nums[leftBound] != target)) {
                leftBound++;
            }

            int rightBound = mid;
            while (rightBound <= nums.length - 1 && nums[rightBound] == target) {
                rightBound++;
            }
            if (rightBound == nums.length || (rightBound <= nums.length - 1 && nums[rightBound] != target)) {
                rightBound--;
            }

            return new int[]{leftBound, rightBound};
        }
    }
}
