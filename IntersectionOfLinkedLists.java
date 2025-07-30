package LinkedList;

public class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
                this.val=val;
                this.next=null;
        }
}

public class .IntersectionOfLinkedLists {
        public static ListNode getIntersectionNode(ListNode head1, ListNode head2){
                if(head1==null||head2==null){
                        return null;
                }
                ListNode a=head1;
                ListNode b=head2;
                while(a!=b){
                        if(a==null){
                                a=head2;
                        }
                        else{
                                a=a.next;
                        }
                        if(b==null){
                                b=head1 ;
                        }
                        else{
                                b=b.next;
                        }
                }
                return a;
        }
}
