public class addFirst {
          public class Node {
                    int data;
                    Node next;

                    Node(int data) {
                              this.data = data;
                              this.next = null;
                    }
          }

          public Node head;
          public Node tail;

          public void add(int data) {
                    Node newNode = new Node(data);
                    if (head == null) {
                              head = newNode;
                              return;
                    }
                    newNode.next = head;
                    head = newNode;
          }

          public void display() {
                    if (head == null) {
                              System.out.println("List is empty");
                              return;
                    }
                    Node curr = head;
                    while (curr != null) {
                              System.out.print(curr.data + "->");
                              curr = curr.next;
                    }
                    System.out.println("null");
          }

          public static void main(String[] args) {
                    addFirst ll = new addFirst();
                    ll.add(1);
                    ll.display();
                    ll.add(2);
                    ll.display();
                    ll.add(3);
                    ll.display();
                    ll.add(4);
                    ll.display();
                    ll.add(5);
                    ll.display();
                    ll.add(6);
                    ll.display();
          }
}
