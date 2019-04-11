package deng.medium;

import deng.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author deng
 * @date 2019/04/08
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        Queue<Integer> layerQueue = new LinkedList<>();
        layerQueue.add(0);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int layerNum = layerQueue.poll();

            List<Integer> curLayer;
            if (result.size() >= layerNum + 1) {
                curLayer = result.get(layerNum);
            } else {
                curLayer = new ArrayList<>();
                result.add(curLayer);
            }

            curLayer.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
                layerQueue.add(layerNum + 1);
            }
            if (node.right != null) {
                queue.add(node.right);
                layerQueue.add(layerNum + 1);
            }
        }

        return result;
    }
}
