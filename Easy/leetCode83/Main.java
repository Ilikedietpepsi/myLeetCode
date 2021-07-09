public class Main {
    public static ListNode deleteDuplicates(ListNode head) {
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

    public static void main(String[] args) {
//        ListNode e = new ListNode(3,null);
//        ListNode d = new ListNode(3,e);
        ListNode c = new ListNode(1,null);
        ListNode b = new ListNode(1,c);
        ListNode a = new ListNode(1,b);


        ListNode head = deleteDuplicates(a);


        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }



	// write your code here
    }
}
