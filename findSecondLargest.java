import java.util.Scanner;

public class findSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        secondLargest(n,a);
    }

    public static void secondLargest(int n, int a[]) {
        int first_largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > first_largest) {
                second_largest = first_largest;
                first_largest = a[i];
            } else if (a[i] > second_largest) {
                second_largest = a[i];
            }
        }
        System.out.println("Second largest value = "+second_largest);
    }
}
// time complexity=O(n)