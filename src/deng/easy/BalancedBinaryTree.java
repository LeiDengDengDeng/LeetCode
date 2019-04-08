package deng.easy;

import deng.common.TreeNode;

/**
 * @author deng
 * @date 2019/04/08
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getHeight(root.left) + 1, getHeight(root.right) + 1);
    }
}
