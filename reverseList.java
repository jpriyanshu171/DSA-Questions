import java.util.Scanner;

public class reverseList {
        ListNode head;

        public static void main(String[] args) {
                reverseList obj = new reverseList();
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter list size:");
                int n = sc.nextInt();
                System.out.println("Enter list elements:");
                for (int i = 0; i < n; i++) {
                        int val = sc.nextInt();
                        obj.add(val);
                }
                System.out.println("Original linked list:");
                obj.display();
                System.out.println("Reversed linked list:");
                obj.head = obj.reverse(obj.head);
                obj.display();
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

        public ListNode reverse(ListNode head) {
                ListNode prev = null;
                ListNode curr = head;
                while (curr != null) {
                        ListNode temp = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = temp;
                }
                return prev;
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

        class ListNode {
                int val;
                ListNode next;

                ListNode(int val) {
                        this.val = val;
                        this.next = null;
                }
        }
}
