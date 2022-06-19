package deng.easy;

import deng.common.ListNodeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2022/06/19
 */
public class MiddleNodeTest {

    @Test
    public void middleNodeOdd() {
        assertEquals(2, new MiddleNode().middleNode(ListNodeUtil.generateListNode(new int[]{1, 2, 3})).val);
    }

    @Test
    public void middleNodeEven() {
        assertEquals(2, new MiddleNode().middleNode(ListNodeUtil.generateListNode(new int[]{1, 2})).val);
    }

    @Test
    public void middleNodeSingle() {
        assertEquals(1, new MiddleNode().middleNode(ListNodeUtil.generateListNode(new int[]{1})).val);
    }
}