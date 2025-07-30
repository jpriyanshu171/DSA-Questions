import java.util.Scanner;

public class checkIfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (isSorted(n,a)){
            System.out.println("Array is sorted in ascending order");
        }
        else{
            System.out.println("Array in not sorted in ascending order");
        }
    }

    public static boolean isSorted(int n, int a[]) {
        for (int i = 0; i < n-1; i++) {
            if (a[i] > a[i + 1]) {
                return false;// not sorted
            }
        }
        return true;// sorted
    }
}
// time complexity=O(n)