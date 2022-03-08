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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode headCopy = head;
        while (headCopy != null) {
            stack.push(headCopy);
            headCopy = headCopy.next;
        }
        while (head != null) {
            ListNode cur = stack.pop();
            if (cur.val != head.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
