package deng.easy;

/**
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * 双指针
 *
 * @author deng
 * @date 2020/01/20
 */
public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        }

        int left = 0;
        while (left < A.length && A[left] < 0) {
            left++;
        }
        int right = left;
        left = right - 1;

        int[] res = new int[A.length];
        int loc = 0;
        while (left >= 0 && right < A.length) {
            if (A[right] <= Math.abs(A[left])) {
                res[loc++] = A[right] * A[right];
                right++;
            } else {
                res[loc++] = A[left] * A[left];
                left--;
            }
        }

        while (left >= 0) {
            res[loc++] = A[left] * A[left];
            left--;
        }

        while (right < A.length) {
            res[loc++] = A[right] * A[right];
            right++;
        }

        return res;
    }
}
