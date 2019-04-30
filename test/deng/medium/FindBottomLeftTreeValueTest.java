package deng.medium;

import deng.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author deng
 * @date 2019/04/30
 */
public class FindBottomLeftTreeValueTest {

    @Test
    public void findBottomLeftValue() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);

        assertEquals(7, new FindBottomLeftTreeValue().findBottomLeftValue(root));
    }
}