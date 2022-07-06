package deng.easy;

/**
 * 二分查找
 * https://leetcode.cn/problems/search-insert-position/
 *
 * @author deng
 * @date 2022/07/06
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
//        return searchInsertRecursive(nums, target, 0, nums.length - 1);
    }

    public int searchInsertRecursive(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }

        int mid = (start + end) / 2;
        if (nums[mid] > target) {
            return searchInsertRecursive(nums, target, start, mid - 1);
        } else if (nums[mid] < target) {
            return searchInsertRecursive(nums, target, mid + 1, end);
        } else {
            return mid;
        }
    }
}
