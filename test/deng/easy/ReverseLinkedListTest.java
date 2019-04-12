package deng.easy;

import deng.common.ListNode;
import deng.common.ListNodeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/12
 */
public class ReverseLinkedListTest {
    @Test
    public void reverseList1() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 2, 3});
        int[] result = ListNodeUtil.convertListNodeToArray(new ReverseLinkedList().reverseList(head));
        assertArrayEquals(new int[]{3, 2, 1}, result);
    }

    @Test
    public void reverseList2() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1});
        assertArrayEquals(new int[]{1}, ListNodeUtil.convertListNodeToArray(new ReverseLinkedList().reverseList(head)));
    }
}