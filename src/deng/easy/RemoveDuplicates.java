package deng.easy;

/**
 * Created by deng on 2018/9/9.
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/description/
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int loc = 1;
        for (int m = 1; m < nums.length; m++) {
            if (nums[m] != nums[m - 1]) {
                nums[loc++] = nums[m];
            }
        }
        return loc;
    }
}
