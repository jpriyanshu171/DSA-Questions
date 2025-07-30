import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter number of place to be rotated:");
        int k=sc.nextInt();
        rotate(nums,k,n);
        System.out.println("Rotated array is:");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void rotate(int nums[],int k,int n){
        k%=nums.length;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;end--;
        }
    }
}