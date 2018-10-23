package lynn.easy;

/**
 * Created by liying on 2018/10/22.
 */

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 * 输入: [2,2,1]
 * 输出: 1
 *
 * 示例 2:
 * 输入: [4,1,2,1,2]
 * 输出: 4
 */
public class singleNumber {
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int i : nums) {
            n = n ^ i;
        }
        return n;
    }
}
/**
 * 解答：异或操作，两个相同的数异或结果为0，一个数跟0异或是这个数本身。
 * 所以所有数进行异或操作最后得出的是只出现一次的数
 */
