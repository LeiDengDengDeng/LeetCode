package lynn.hard;

import deng.common.ListNode;

/**
 * Created by liying on 2019/4/18.
 */

public class MergekSortedLists {
    /**
     * 应该用分治
     *
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==1){
            return lists[0];
        }
        if(lists.length==0){
            return null;
        }
        ListNode head=mergeTwoLists(lists[0],lists[1]);
        for (int i = 2; i < lists.length; i++) {
            head=mergeTwoLists(head,lists[i]);
        }
        return  head;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
