package deng.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author deng
 * @date 2019/04/03
 */
public final class ListNodeUtil {
    private ListNodeUtil() {
    }

    public static ListNode generateListNode(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        ListNode fakeHead = new ListNode(0);
        ListNode index = fakeHead;
        for (int i = 0; i < nums.length; i++) {
            index.next = new ListNode(nums[i]);
            index = index.next;
        }

        return fakeHead.next;
    }

    public static int[] convertListNodeToArray(ListNode head) {
        List<Integer> data = new LinkedList<>();
        while (head != null) {
            data.add(head.val);
            head = head.next;
        }
        return data.stream().mapToInt(Integer::valueOf).toArray();
    }
}
