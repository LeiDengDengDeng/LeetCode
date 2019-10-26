package deng.medium;

import deng.common.TreeNode;

/**
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 *
 * @author deng
 * @date 2019/10/26
 */
public class KthSmallest {
    private int counter = 0;
    private int val;
    private boolean stopFlag = false;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return val;
    }

    private void inorder(TreeNode root, int k) {
        // 中序遍历
        if (root == null || stopFlag) {
            return;
        }
        inorder(root.left, k);

        if (++counter == k) {
            val = root.val;
            stopFlag = true;
        }

        inorder(root.right, k);
    }
}
