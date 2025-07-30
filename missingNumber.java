import java.util.Scanner;

public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = missing(nums);
        System.out.println("Missing number:" + ans);
    }

    public static int missing(int nums[]) {
        int n = nums.length;
        int totalSum = (n * (n + 1) / 2);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int missing = totalSum - sum;
        return missing;
    }
}
