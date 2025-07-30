import java.util.Scanner;

public class fibonacci {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter n:");
                int n=sc.nextInt();
                System.out.println("Fibonacci series of "+n+" numbers is: ");
                for(int i=0;i<n;i++){
                        System.out.print(fibo(i)+" ");
                }
                System.out.println();
        }

        public static int fibo(int n) {
                if (n == 0) {
                        return 0;
                } else if (n == 1) {
                        return 1;
                } else {
                        return (fibo(n - 1) + fibo(n - 2));
                }
        }
}