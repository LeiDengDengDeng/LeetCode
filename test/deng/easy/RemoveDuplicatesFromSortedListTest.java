package deng.easy;

import deng.common.ListNode;
import deng.common.ListNodeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/03
 */
public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void deleteDuplicates1() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 2});
        new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

        assertArrayEquals(ListNodeUtil.convertListNodeToArray(head), new int[]{1, 2});
    }

    @Test
    public void deleteDuplicates2() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 1, 2});
        new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

        assertArrayEquals(ListNodeUtil.convertListNodeToArray(head), new int[]{1, 2});
    }

    @Test
    public void deleteDuplicates3() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 1, 2, 3, 3});
        new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

        assertArrayEquals(ListNodeUtil.convertListNodeToArray(head), new int[]{1, 2, 3});
    }


    @Test
    public void deleteDuplicates4() {
        ListNode head = ListNodeUtil.generateListNode(new int[]{1, 1, 1});
        new RemoveDuplicatesFromSortedList().deleteDuplicates(head);

        assertArrayEquals(ListNodeUtil.convertListNodeToArray(head), new int[]{1});
    }
}