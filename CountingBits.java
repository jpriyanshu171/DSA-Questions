package Arrays;

import java.util.Scanner;

public class CountingBits {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter n for counting bits:");
                int n = sc.nextInt();
                System.out.println("Number of 1s in binary representations from 0 to " + n + " is=" + countBits(n));
        }

        public static int countBits(int n) {
                int count = 0;
                for (int i = 0; i <= n; i++) {
                        int num = i;
                        while (num > 0) {
                                num &= (num - 1);
                                count++;
                        }
                }
                return count;
        }
}
