package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size:");
                int n = sc.nextInt();
                int[] a = new int[n];
                System.out.println("Enter array elements:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }

                int[] result = nextGreaterElements(a);
                System.out.println("Next Greater Elements:");
                for (int i = 0; i < result.length; i++) {
                        System.out.print(result[i] + " ");
                }
                System.out.println();
        }

        public static int[] nextGreaterElements(int a[]) {
                int n = a.length;
                int result[] = new int[n];
                Stack<Integer> st = new Stack<>();
                for (int i = n - 1; i >= 0; i--) {
                        while (!st.isEmpty() && st.peek() <= a[i]) {
                                st.pop();
                        }
                        if (st.isEmpty()) {
                                result[i] = -1;
                        } else {
                                result[i] = st.peek();
                        }
                        st.push(a[i]);
                }
                return result;
        }
}