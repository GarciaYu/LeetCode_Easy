package _021;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class Solution_Yu {
    /*
    Approach
    Time Complexity: 86%
    Space Complexity: 5%
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode nextNode = headNode;
        int val1 = l1 == null ? Integer.MAX_VALUE : l1.val;
        int val2 = l2 == null ? Integer.MAX_VALUE : l2.val;
        while (val1 != Integer.MAX_VALUE || val2 != Integer.MAX_VALUE) {
            if (val1 < val2) {
                nextNode.next = new ListNode(val1);
                l1 = l1.next;
                val1 = l1 == null ? Integer.MAX_VALUE : l1.val;
            } else {
                nextNode.next = new ListNode(val2);
                l2 = l2.next;
                val2 = l2 == null ? Integer.MAX_VALUE : l2.val;
            }
            nextNode = nextNode.next;
        }
        return headNode.next;
    }
}
