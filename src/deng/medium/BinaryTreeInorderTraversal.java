package deng.medium;

import deng.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 树的中序遍历
 *
 * @author deng
 * @date 2019/04/03
 */
public class BinaryTreeInorderTraversal {
    // 非递归
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<Integer> result = new LinkedList<>();
        List<TreeNode> nodes = new LinkedList<>(); // 待遍历的节点
        List<TreeNode> passNodes = new ArrayList<>(); // 已遍历的节点
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.get(0);

            if (node.left != null && !passNodes.contains(node.left)) {
                nodes.add(0, node.left);
            } else {
                result.add(node.val);
                passNodes.add(node);
                nodes.remove(0);
                if (node.right != null && !passNodes.contains(node.right)) {
                    nodes.add(0, node.right);
                }
            }
        }

        return result;
    }


    // 递归
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        recusive(root, result);
        return result;
    }

    private void recusive(TreeNode root, List<Integer> result) {
        if (root == null) return;

        recusive(root.left, result);
        result.add(root.val);
        recusive(root.right, result);
    }
}
