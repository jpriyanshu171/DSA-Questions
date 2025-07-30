package Arrays;

import java.util.Scanner;

public class MaxSumSubArrayOfSizeK {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array:");
                int n = sc.nextInt();
                int[] a = new int[n];

                System.out.println("Enter array elements:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }

                System.out.println("Enter value of k:");
                int k = sc.nextInt();
                int maxSum = maxSumSubArray(a, k);
                System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
        }

        public static int maxSumSubArray(int a[], int k) {
                int n = a.length;
                if (n < k) {
                        System.out.println("Invalid array size should be greater than k");
                        return -1;
                } else {
                        int currentSum = 0;
                        for (int i = 0; i < k; i++) {
                                currentSum += a[i];
                        }
                        int maxSum = currentSum;
                        for (int i = k; i < n; i++) {
                                currentSum += a[i] - a[i - k];
                                maxSum = Math.max(maxSum, currentSum);
                        }
                        return maxSum;
                }
        }
}
