package deng.easy;

/**
 * Created by deng on 2018/9/8.
 * https://leetcode-cn.com/problems/remove-element/description/
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {
    // 一开始想的是如果是nums[i]==val应该如何处理
    // 反向思维，处理nums[i]!=val
    public int removeElement(int[] nums, int val) {
        int loc = 0; // 0-loc的数字都不等于val
        for (int m = 0; m < nums.length; m++) {
            // 只遍历一边数组，将不等于val的数字放到loc处
            if (nums[m] != val) {
                nums[loc++] = nums[m];
            }
        }
        return loc;
    }
}
