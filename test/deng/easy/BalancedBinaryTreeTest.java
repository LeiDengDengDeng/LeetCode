package deng.easy;

import deng.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/08
 */
public class BalancedBinaryTreeTest {

    @Test
    public void isBalanced1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertTrue(new BalancedBinaryTree().isBalanced(root));
    }

    @Test
    public void isBalanced2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);

        assertFalse(new BalancedBinaryTree().isBalanced(root));
    }
}