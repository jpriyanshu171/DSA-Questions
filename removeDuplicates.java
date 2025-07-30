import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = remove(n, a);
        System.out.println("Array with unique elements = ");
        for (int i = 0; i < x; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int remove(int n, int a[]) {
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (a[i] != a[j]) { // unique element
                i++;
                a[i] = a[j];
            }
        }
        return i + 1; // length of new array without duplicates
    }
}
// time complexity=O(n)