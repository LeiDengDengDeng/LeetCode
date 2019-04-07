package deng.medium;

import deng.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/04
 */
public class BinaryTreeInorderTraversalTest {

    @Test
    public void inorderTraversal1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);

        int[] res = new BinaryTreeInorderTraversal().inorderTraversal(root).stream().mapToInt(Integer::intValue).toArray();
        assertArrayEquals(new int[]{3, 2, 1, 4, 5}, res);
    }

    @Test
    public void inorderTraversal2() {
        assertEquals(0, new BinaryTreeInorderTraversal().inorderTraversal(null).size());
    }
}