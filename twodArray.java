import java.util.Scanner;

public class twodArray {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter rows:");
                int row = sc.nextInt();
                System.out.println("Enter columns:");
                int col = sc.nextInt();

                int a[][] = new int[row][col];

                System.out.println("Enter elements:");
                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                                a[i][j] = sc.nextInt();
                        }
                }
                System.out.println("The 2d array is:");
                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                                System.out.print(a[i][j] + "  ");
                        }
                        System.out.println();
                }
        }
}
