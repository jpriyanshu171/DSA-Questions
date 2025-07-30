import java.util.Arrays;
import java.util.Scanner;

public class rearrangeArrayElementsBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Rearranged array is:");
        int result[] = rearrange(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrange(int nums[]) {
        int posIndex = 0;
        int negIndex = 1;
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                ans[negIndex] = nums[i];
                negIndex += 2;
            } else {
                ans[posIndex] = nums[i];
                posIndex += 2;
            }
        }
        return ans;
    }
}