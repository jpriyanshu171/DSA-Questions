import java.util.Scanner;

public class prefixProduct {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of an array:");
                int n=sc.nextInt();
                int a[]=new int[n];
                int preproduct[]=new int[n];

                System.out.println("Enter array elements:");
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                // prefix product logic

                preproduct[0]=a[0];
                for(int i=1;i<n;i++){
                        preproduct[i]=a[i]*preproduct[i-1];
                }
                System.out.println("The prefix product array is:");
                for(int i=0;i<preproduct.length;i++){
                        System.out.println(preproduct[i]+" ");
                }
        }
}
