package deng.medium;

import deng.common.ListNode;
import deng.common.ListNodeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/12
 */
public class RemoveNthNodeFromEndOfListTest {
    @Test
    public void removeNthFromEnd1() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 5}, ListNodeUtil.convertListNodeToArray(new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 2)));
    }

    @Test
    public void removeNthFromEnd2() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{2, 3, 4, 5}, ListNodeUtil.convertListNodeToArray(new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 5)));
    }

    @Test
    public void removeNthFromEnd3() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{1, 2, 3, 4}, ListNodeUtil.convertListNodeToArray(new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1)));
    }

    @Test
    public void removeNthFromEnd4() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1});
        assertArrayEquals(new int[]{}, ListNodeUtil.convertListNodeToArray(new RemoveNthNodeFromEndOfList().removeNthFromEnd(head, 1)));
    }
}