import java.util.Scanner;

public class mergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array 1 size:");
        int m = sc.nextInt();
        System.out.println("Enter array 2 size:");
        int n = sc.nextInt();
        int nums1[] = new int[m+n];
        int nums2[] = new int[n];
        System.out.println("Enter array 1 elements:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2 elements:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }
        merge(nums1,m,nums2,n);
        System.out.println("Sorted array is:");
        for (int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }

    public static void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        while(j>=0){
            nums1[k]=nums2[j];
            k--;j--;
        }
    }
}
