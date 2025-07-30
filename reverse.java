import java.util.Scanner;

public class reverse {
          class Node {
                    int data;
                    Node next;

                    Node(int data) {
                              this.data = data;
                              this.next = null;
                    }
          }

          Node head;
          Node tail;

          public Node reverseList(Node head) {
                    Node prev = null;
                    Node curr = head;
                    Node temp = null;
                    while (curr != null) {
                              temp = curr.next;
                              curr.next = prev;
                              prev = curr;
                              curr = temp;
                    }
                    return prev;
          }

          public void display() {
                    Node curr = head;
                    if (head == null) {
                              System.out.println("Empty linked list");
                              return;
                    }
                    while (curr != null) {
                              System.out.print(curr.data + "->");
                              curr = curr.next;
                    }
                    System.out.println("null");
          }

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter the number of elements:");
                    int n = sc.nextInt();
                    System.out.println("Enter the elements:");
                    for (int i = 0; i < n; i++) {
                              int data = sc.nextInt();
                    }
          }
}
