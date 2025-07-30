import java.util.Scanner;

public class binarySearch {
        public static void main(String[] args) {
                Scanner sc=new Scanner (System.in);
                System.out.println("Enter the size of array:");
                int n=sc.nextInt();
                int a[]=new int[n];
                System.out.println("Enter sorted array elements:");
                for(int i=0;i<n;i++){
                        a[i]=sc.nextInt();
                }
                System.out.println("Enter target element:");
                int target=sc.nextInt();
                int result=search(a,target);
                if(result!=-1){
                        System.out.println("Element found at index: "+result);
                }
        }
        public static int search(int a[],int target){
                int low=0;
                int high=a.length-1;
                while(low<=high){
                        int mid=low+(high-low)/2;
                        if(a[mid]<target){
                                low=mid+1;
                        }
                        else if(a[mid]>target){
                                high=mid-1;
                        }
                        else{
                                return mid;
                        }
                }
                return -1;
        }
}
