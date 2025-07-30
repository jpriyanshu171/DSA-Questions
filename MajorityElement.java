package Arrays;

import java.util.Scanner;

public class MajorityElement {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array size:");
                int n = sc.nextInt();
                int a[] = new int[n];
                System.out.println("Enter the array elements:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
                int result = findMajorityElement(a);
                if (result != -1) {
                        System.out.println("Majority element is=" + result);
                } else {
                        System.out.println("No majority element found!");
                }
        }

        public static int findMajorityElement(int a[]) {
                int count = 0;
                int candidate = -1;
                for (int i = 0; i < a.length; i++) {
                        if (count == 0) {
                                candidate = a[i];
                                count=1;
                        } else if (a[i] == candidate) {
                                count++;
                        } else {
                                count--;
                        }
                }
                count = 0;
                for (int i = 0; i < a.length; i++) {
                        if (a[i] == candidate) {
                                count++;
                        }
                }
                if (count > a.length / 2) {
                        return candidate;
                }
                return -1;
        }
}
