package deng.medium;

import deng.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/find-bottom-left-tree-value/comments/
 * 给定一个二叉树，在树的最后一行找到最左边的值。
 *
 * @author deng
 * @date 2019/04/30
 */
public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int result = 0;
        while (!queue.isEmpty()) {
            TreeNode head = queue.poll();
            result = head.val;

            if (head.right != null) queue.add(head.right);
            if (head.left != null) queue.add(head.left);
        }

        return result;
    }
}
