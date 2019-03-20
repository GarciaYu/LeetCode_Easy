package _021;

/**
 * Merge Two Sorted Lists
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together
 * the nodes of the first two lists.
 * <p>
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Main {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        toListNodeString(l1);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        toListNodeString(l2);

//        Solution_Yu solution = new Solution_Yu();
        Solution_01 solution = new Solution_01();
        toListNodeString(solution.mergeTwoLists(l1, l2));
    }

    public static void toListNodeString(ListNode listNode) {
        while (listNode != null) {
            int val = listNode.val;
            System.out.print(val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }
}
