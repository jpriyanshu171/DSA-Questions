package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size:");
                int n = sc.nextInt();
                int a[] = new int[n];
                System.out.println("Enter array elements:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                System.out.println("Enter window size k:");
                int k = sc.nextInt();

                int result[] = maxSlidingWindow(a, k);
                System.out.println("Maximum of each window:");
                for(int i=0;i<result.length;i++){
                        System.out.print(result[i]+" ");
                }
                System.out.println();
        }

        public static int[] maxSlidingWindow(int a[], int k) {
                if (a.length == 0 || k == 0) {
                        return new int[0];
                }
                int n = a.length;
                int result[] = new int[n - k + 1];
                Deque<Integer> dq = new LinkedList<>();
                for (int i = 0; i < n; i++) {
                        while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                                dq.pollFirst();
                        }
                        while (!dq.isEmpty() && a[dq.peekLast()] < a[i]) {
                                dq.pollLast();
                        }
                        dq.offerLast(i);

                        if(i>=k-1){
                                result[i-k+1]=a[dq.peekFirst()];
                        }
                }
                return result;
        }
}
