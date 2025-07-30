import java.util.Scanner;

public class minStepByStepSum {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println(":Enter the size of the array:");
                int n = sc.nextInt();
                int a[] = new int[n];

                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }

                // minimum value to get positive step by step sum

                int minSum = 0;
                int sum = 0;
                for (int i = 0; i < n; i++) {
                        sum = sum + a[i];
                        minSum = Math.min(minSum, sum);
                }
                System.out.println("The minnimum start value is:"+(1-minSum));
        }
}
