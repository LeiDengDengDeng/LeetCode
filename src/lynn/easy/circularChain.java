package lynn.easy;

import java.util.Arrays;

/**
 * Created by liying on 2018/7/16.
 */
public class circularChain {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
       ListNode point=head.next;
       while(point.next!=null){
           head=head.next;
           point=point.next.next;
           if(head==point){
               return true;
           }
       }


        return false;

    }


    class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
           val = x;
           next = null;
       }
    }

}
