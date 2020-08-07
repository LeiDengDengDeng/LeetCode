package deng.easy;


import deng.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/same-tree/
 *
 * @author deng
 * @date 2020/08/07
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else if (p == null && q == null) {
            return true;
        } else {
            return false;
        }
    }
}
