package Arrays;

import java.util.Scanner;

public class PrefixSumArray {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int n = sc.nextInt();
                int a[]=new int[n];
                System.out.println("Enter the array elements:");
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                // prefix sum array logic
                int prefix[]=new int[n];
                prefix[0]=a[0];
                for(int i=1;i<n;i++){
                        prefix[i]=prefix[i-1]+a[i];
                }

                System.out.println("Enter range L and R ");
                int L=sc.nextInt();
                int R=sc.nextInt();
                int rangeSum;
                if(L==0){
                        rangeSum=prefix[R];
                }
                else{
                        rangeSum=prefix[R]-prefix[L-1];
                }
                System.out.println("Sum of elements in given ranges using prefix sum is="+rangeSum);
        }
}
