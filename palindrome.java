import java.util.*;

public class palindrome {
    class Node {
        public static int findMid(Node head) {
            ll.Node slow = head;
            Node fast = head;

            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

          public static boolean isPalindrome(Node head) {
                    if (head == null) {
                              return true;
                    }
                    Node mid = findMid(head);
                    Node prev = null;
                    Node curr = mid;
                    Node next = null;
                    while (curr != null) {
                              next = curr.next;
                              curr.next = prev;
                              prev = curr;
                              curr = prev;
                    }
                    Node second = mid.next;
                    while (prev != null) {
                              if (prev.data != second.data) {
                                        return false;
                              }
                              second = second.next;
                              prev = prev.next;
                    }
                    return true;
          }

          public static void main(String[] args) {

          }

}
