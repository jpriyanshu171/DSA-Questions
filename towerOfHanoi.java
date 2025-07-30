import java.util.Scanner;

public class towerOfHanoi {
        public static void tower(int n, char s, char h, char d) {
// n=number of disks
// s=source rod
// h=helper rod
// d=destination rod
                if (n <= 0) {
                } else {
                        tower(n - 1, s, d, h);
                        System.out.println("Move disk " + n + " from " + s + " to " + d + " ");
                        tower(n - 1, h, s, d);
                }
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number of disks");
                int n = sc.nextInt();
                tower(n, 'A', 'C', 'B');
        }
}