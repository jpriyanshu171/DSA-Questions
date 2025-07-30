import java.util.Scanner;

public class linkedListCycle1 {
        ListNode head;

        public static void main(String[] args) {
                linkedListCycle1 obj = new linkedListCycle1();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter list size:");
                int n = sc.nextInt();
                System.out.println("Enter list elements:");
                for (int i = 0; i < n; i++) {
                        int val = sc.nextInt();
                        obj.add(val);
                }
                System.out.println("Given linked list:");
                obj.display();
                boolean ans= obj.cycle(obj.head);
                System.out.println("Cycle:"+ans);
        }

        public boolean cycle(ListNode head) {
                if (head == null || head.next == null) {
                        return false;
                } else {
                        ListNode slow = head;
                        ListNode fast = head;
                        while (fast != null && fast.next != null) {
                                slow = slow.next;
                                fast = fast.next.next;
                                if (slow == fast) {
                                        return true;
                                }
                        }
                }
                return false;
        }

        public void add(int val) {
                ListNode newNode = new ListNode(val);
                if (head == null) {
                        head = newNode;
                } else {
                        ListNode current = head;
                        while (current.next != null) {
                                current = current.next;
                        }
                        current.next = newNode;
                }
        }

        public void display() {
                if (head == null) {
                        System.out.println("Empty linked list");
                } else {
                        ListNode current = head;
                        while (current != null) {

                                System.out.print(current.val + "->");
                                current = current.next;
                        }
                        System.out.println("null");
                }
        }
}

class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
                this.val = val;
                this.next = null;
        }
}
