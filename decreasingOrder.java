import java.util.Scanner;

public class decreasingOrder {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter n:");
                int n = sc.nextInt();
                System.out.println("Numbers in decreasing order: ");
                print(n);
        }

        public static void print(int n) {
                if (n <= 0) {
                } else {
                        System.out.print(n + " ");
                        print(n - 1);
                }
        }
}