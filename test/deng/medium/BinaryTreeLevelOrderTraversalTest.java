package deng.medium;

import deng.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author deng
 * @date 2019/04/08
 */
public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(3, new BinaryTreeLevelOrderTraversal().levelOrder(root).size());
    }
}