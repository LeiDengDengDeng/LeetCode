package deng.easy;

/**
 * https://leetcode-cn.com/problems/plus-one/description/
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int loc = digits.length - 1;
        boolean addFlag;
        do {
            addFlag = add(digits, loc);
            loc--;
        } while (addFlag && loc >= 0);

        if (addFlag) {
            // 数组长度增加一位，进位到最高位
            int[] result = new int[1 + digits.length];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }

    private boolean add(int[] digits, int loc) {
        digits[loc] = (digits[loc] + 1) - (digits[loc] + 1) / 10 * 10;
        return digits[loc] == 0;
    }
}
