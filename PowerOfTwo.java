package Arrays;

import java.util.Scanner;

public class PowerOfTwo {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number to check if its a power of two:");
                int n = sc.nextInt();
                if(isPowerOfTwo(n)){
                        System.out.println(n+" is a power of two.");
                }
                else{
                        System.out.println(n+" is not a power of two.");
                }
        }

        public static boolean isPowerOfTwo(int n) {
                if (n <= 0) {
                        return false;
                } else {
                        return (n & (n - 1)) == 0;
                }
        }
}
