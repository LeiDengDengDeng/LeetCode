package lynn.medium;

import deng.common.ListNode;
import deng.common.ListNodeUtil;

/**
 * Created by liying on 2019/4/16.
 */
public class SwapNodesinPairs {

    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode temp=new ListNode(0);
        ListNode temp2=new ListNode(0);
        temp2.next=head.next;
        temp.next=swapPairs(head.next.next);
        head.next.next=head;
        head.next=temp.next;
        return temp2.next;
    }
    public static void main(String[] args){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;
        SwapNodesinPairs swapNodesinPairs=new SwapNodesinPairs();
        ListNode head=swapNodesinPairs.swapPairs(node1);
        int[] array=ListNodeUtil.convertListNodeToArray(head);
        System.out.println(array);

    }
}
