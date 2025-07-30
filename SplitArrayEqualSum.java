package Arrays;

import java.util.Scanner;

public class SplitArrayEqualSum {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array size:");
                int n = sc.nextInt();
                int a[] = new int[n];
                System.out.println("Enter array elements:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                int result = findSplitPoint(a);
                if (result != -1) {
                        System.out.println("The array can be split into equal sum prefix and suffix at index=" + result);
                } else {
                        System.out.println("the array can not be split into equal sum prefix and suffix.");
                }
        }

        public static int findSplitPoint(int a[]) {
                int total = 0;
                for (int i = 0; i < a.length; i++) {
                        total = total + a[i];
                }
                int prefixSum = 0;
                for (int i = 0; i < a.length; i++) {
                        total = total - a[i];
                        if (prefixSum == total) {
                                return i;
                        } else {
                                prefixSum += a[i];
                        }
                }
                return -1;
        }
}
