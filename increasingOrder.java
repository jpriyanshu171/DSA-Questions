import java.util.Scanner;

public class increasingOrder {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter n:");
                int n=sc.nextInt();
                System.out.println("Numbers in increasing order: ");
                print(n);
        }
        public static void print(int n) {
                if (n <= 0) {
                        return;
                } else {
                        print(n-1);
                        System.out.print(n+" ");
                }
        }
}
