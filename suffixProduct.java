import java.util.Scanner;

public class suffixProduct {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of the array:");
                int n=sc.nextInt();
                int a[]=new int[n];
                int suffproduct[]=new int[n];

                System.out.println("Enter array elememts:");
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                suffproduct[n-1]=a[n-1];
                for(int i=n-2;i>=0;i--){
                        suffproduct[i]=a[i]*suffproduct[i+1];
                }
                System.out.println("The suffix product array is:");
                for(int i=0;i<suffproduct.length;i++){
                        System.out.println(suffproduct[i]+" ");
                }
        }
}
