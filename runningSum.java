import java.util.Scanner;

public class runningSum {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the size of the array: ");
                int n = sc.nextInt();
                int a[] = new int[n];

                System.out.println("Enter the array elements:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }

                // running sum array logic
                for (int i = 1; i < n; i++) {
                        a[i] = a[i] + a[i - 1];
                }

                System.out.println("The running sum array is:");
                for (int i = 0; i < n; i++) {
                        System.out.println(a[i] + " ");
                }
        }
}