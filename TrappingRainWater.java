package Arrays;

import java.util.Scanner;

public class TrappingRainWater {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter array size:");
                int n=sc.nextInt();
                int a[]=new int[n];
                System.out.println("Enter the bar heights:");
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                int result=trap(a);
                System.out.println("Trapped water is: "+result);
        }
        public static int trap(int a[]){
                if(a.length==0){
                        return 0;
                }
                int left=0;
                int right=a.length-1;
                int leftMax=0;
                int rightMax=0;
                int trappedWater=0;

                while(left<=right){
                        if(a[left]<=a[right]) {
                                if (a[left] >= leftMax) {
                                        leftMax = a[left];
                                } else {
                                        trappedWater = trappedWater + leftMax - a[left];
                                }
                                left++;
                        }
                        else{
                                if(a[right]>=rightMax){
                                        rightMax=a[right];
                                }
                                else{
                                        trappedWater=trappedWater+rightMax-a[right];
                                }
                                right--;
                        }
                }
                return trappedWater;
        }
}
