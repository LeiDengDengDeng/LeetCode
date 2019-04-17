package lynn.easy;

import deng.common.ListNodeUtil;

import deng.common.ListNode;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liying on 2019/4/18.
 */
public class MergeTwoSortedLists {
    /**
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode head;
        ListNode other1;
        ListNode other2;
        if (l1.val > l2.val) {
            head = l2;
            other1 = l2;
            other2 = l1;
        } else {
            head = l1;
            other1 = l1;
            other2 = l2;

        }

        while (other1.next != null && other2 != null) {
            if (other1.next.val > other2.val) {
                ListNode temp=other1.next;
                other1.next=other2;
                other2=temp;
            }
            other1=other1.next;
        }
        if(other1.next==null){
            other1.next=other2;
        }
        return head;

    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode listNode = mergeTwoSortedLists.mergeTwoLists(ListNodeUtil.generateListNode(new int[]{1,2,4}), ListNodeUtil.generateListNode(new int[]{1, 3, 4}));
        System.out.println(Arrays.toString(ListNodeUtil.convertListNodeToArray(listNode)));
    }
}
