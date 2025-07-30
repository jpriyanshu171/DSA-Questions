package LinkedList;

class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
                this.val = val;
                this.next = null;
        }
}

public class RemoveNthNodeFromEnd {
        public static ListNode removeNthNode(ListNode head, int n) {
                ListNode dummy = new ListNode(0);
                dummy.next = head;
                ListNode a = dummy;
                ListNode b = head;
                for (int i = 0; i < n; i++) {
                        a = a.next;
                }
                while(a.next!=null){
                        a=a.next;
                        b=b.next;
                }
                b.next=b.next.next;
                return dummy.next;
        }
}
