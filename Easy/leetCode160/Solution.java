/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode copyA = headA;
        ListNode copyB = headB;

        int lenA = 0;
        int lenB = 0;
        while (copyA != null) {
            lenA++;
            copyA = copyA.next;
        }

        while (copyB != null) {
            lenB++;
            copyB = copyB.next;
        }
        if (lenA - lenB >= 0) {
            for (int i = 0; i < lenA - lenB; i++) {
                headA = headA.next;
            }
        }

        if (lenB - lenA >= 0) {
            for (int i = 0; i < lenB - lenA; i++) {
                headB = headB.next;
            }
        }
        while (headA!=null) {
            if (headA==headB) {
                return headA;
            }
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }

        return null;

    }
}
