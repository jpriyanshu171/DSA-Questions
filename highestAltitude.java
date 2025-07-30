import java.util.Scanner;

public class highestAltitude {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number of altitude gains: ");
                int n = sc.nextInt();
                int gain[] = new int[n];

                System.out.println("Enter the altitude gain values:");
                for (int i = 0; i < n; i++) {
                        gain[i] = sc.nextInt();
                }

                // max altitude logic

                int max = 0;
                int curr = 0;
                for (int i = 0; i < gain.length; i++) {
                        curr = curr + gain[i];
                        max = Math.max(curr, max);
                }
                System.out.println("The highest altitude is:"+max);
        }
}