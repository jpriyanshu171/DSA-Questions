import java.util.Scanner;

public class prefixSum {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of an array:");
                int n=sc.nextInt();
                int a[]=new int[n];
                int prefix[]=new int[n];

                System.out.println("Enter array elements:");
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                // prefix sum logic

                prefix[0]=a[0];
                for(int i=1;i<n;i++){
                        prefix[i]=a[i]+prefix[i-1];
                }
                System.out.println("The prefix sum array is:");
                for(int i=0;i<prefix.length;i++){
                        System.out.println(prefix[i]+" ");
                }
        }
}
