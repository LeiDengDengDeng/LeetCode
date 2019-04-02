package deng.easy;

import deng.common.ListNode;
import deng.common.ListNodeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/03
 */
public class MergeTwoSortedListsTest {
    @Test
    public void mergeTwoLists() {
        ListNode l1 = ListNodeUtil.generateListNode(new int[]{1, 2, 4, 8});
        ListNode l2 = ListNodeUtil.generateListNode(new int[]{1, 3, 4});

        ListNode res = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        assertArrayEquals(ListNodeUtil.convertListNodeToArray(res), new int[]{1, 1, 2, 3, 4, 4, 8});
    }
}