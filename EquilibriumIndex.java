package Arrays;

import java.util.Scanner;

public class EquilibriumIndex {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array size:");
                int n = sc.nextInt();
                int a[] = new int[n];
                System.out.println("Enter the array elements:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }

                // find Equilibrium index

                int equilibriumIndex = findEquilibriumIndex(a);
                if (equilibriumIndex != -1) {
                        System.out.println("Equilibrium index is =" + equilibriumIndex);
                } else {
                        System.out.println("No equilibrium index found!");
                }
        }

        public static int findEquilibriumIndex(int a[]) {
                int total = 0;
                for (int i = 0; i < a.length; i++) {
                        total += a[i];
                }
                int leftSum = 0;
                for (int i = 0; i < a.length; i++) {
                        total = total - a[i];
                        if (leftSum == total) {
                                return i;
                        } else {
                                leftSum+=a[i];
                        }
                }
                return -1;
        }
}