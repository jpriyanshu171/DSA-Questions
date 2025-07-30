package Arrays;

import java.util.Scanner;

public class TwoSumInSortedArray {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size:");
                int n = sc.nextInt();
                int a[] = new int[n];
                System.out.println("Enter the sorted array:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                System.out.println("Enter the target sum:");
                int target = sc.nextInt();

                int result[] = findTwoSum(a, target);
                if (result != null) {
                        System.out.println("Pair found:" + result[0] + " and " + result[1]);
                } else {
                        System.out.println("No pair found!");
                }
        }

        public static int[] findTwoSum(int a[], int target) {
                int left = 0;
                int right = a.length - 1;
                while (left < right) {
                        int sum = a[left] + a[right];
                        if (sum == target) {
                                return new int[]{a[left], a[right]};
                        } else if (sum < target) {
                                left++;
                        } else {
                                right--;
                        }
                }
                return null;
        }
}
