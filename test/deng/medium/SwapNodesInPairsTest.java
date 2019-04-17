package deng.medium;

import deng.common.ListNode;
import deng.common.ListNodeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/16
 */
public class SwapNodesInPairsTest {

    @Test
    public void recSwapPairs() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 2, 3, 4});
        head = new SwapNodesInPairs().swapPairs(head);
        assertArrayEquals(new int[]{2, 1, 4, 3}, ListNodeUtil.convertListNodeToArray(head));
    }

    @Test
    public void nonRecSwapPairs() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 2, 3, 4});
        head = new SwapNodesInPairs().nonRecSwapPairs(head);
        assertArrayEquals(new int[]{2, 1, 4, 3}, ListNodeUtil.convertListNodeToArray(head));
    }
}