import java.util.Scanner;

public class powerOf {

        public static int power(int a, int b) {
                if (b == 0) {
                        return 1;
                }
                return a * power(a, b - 1);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the base value");
                int a = sc.nextInt();
                System.out.println("Enter the power value");
                int b = sc.nextInt();
                System.out.println("Result=" + power(a, b));
        }
}