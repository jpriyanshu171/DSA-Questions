import java.util.Scanner;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans=remove(nums);
        System.out.println("Length of array after removing duplicates:"+ans);
        System.out.println("Array with unique elememts is:");
        for(int i=0;i<ans;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int remove(int nums[]) {
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}