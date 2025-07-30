import java.util.Scanner;

public class suffixSum {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of an array:");
                int n=sc.nextInt();
                int a[]=new int[n];
                int suffix[]=new int[n];

                System.out.println("Enter array elements:");
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }

                suffix[n-1]=a[n-1];
                for(int i=n-2;i>=0;i--){
                        suffix[i]=a[i]+suffix[i+1];
                }
                System.out.println("The suffix sum array is:");
                for(int i=0;i<suffix.length;i++){
                        System.out.println(suffix[i]+" ");
                }
        }
}
