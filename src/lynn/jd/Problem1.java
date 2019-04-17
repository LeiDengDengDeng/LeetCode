package lynn.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by liying on 2019/4/13.
 */
public class Problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ListNode[] listNodes = new ListNode[n];
        for (int i = 0; i < n; i++) {
            ListNode listNode = new ListNode();
            listNodes[i] = listNode;
        }
        for (int i = 0; i < n - 1; i++) {

            int a = in.nextInt() - 1;
            int b = in.nextInt() - 1;
            listNodes[a].parentNode.add(listNodes[b]);
            listNodes[b].leafNode.add(listNodes[a]);
        }
        boolean quit = false;
        int count = 0;
        while (!quit) {
            count++;
            boolean notHasParent = true;
            List<Integer> noParentList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!listNodes[i].nothasParentNode()) {
                    notHasParent = false;
                } else {
                    noParentList.add(i);
                }
            }

            for (Integer j : noParentList) {
                List<ListNode> leaf=listNodes[j].leafNode;
                if (leaf .size() >0) {
                    leaf.get(0).parentNode.remove(listNodes[j]);
                    listNodes[j].leafNode.remove(leaf.get(0));
                }
            }

            quit = notHasParent;
        }
        System.out.println(count);

    }


//            6
//            2 1
//            3 2
//            4 3
//            5 2
//            6 1
}

class ListNode {
    public List<ListNode> leafNode = new ArrayList<>();
    public List<ListNode> parentNode = new ArrayList<>();

    public boolean nothasParentNode() {
        return parentNode.size() == 0;
    }


}