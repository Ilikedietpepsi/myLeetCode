/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if (temp == null) {
            return head;
        }
        while (temp != null) {
            if (temp.next == null) {
                break;
            }
            while(temp.val == temp.next.val) {
                if (temp.val == temp.next.val) {
                    ListNode next = temp.next.next;
                    temp.next.next = null;
                    temp.next = next;
                }
                if (temp.next == null) {
                    break;
                }

            }
            temp = temp.next;
        }


        return head;
    }
}
