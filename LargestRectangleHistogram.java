package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleHistogram {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of bars:");
                int n = sc.nextInt();
                int a[] = new int[n];
                System.out.println("Enter heights:");
                for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                }
        }
        public static int largestRectangleArea(int a[]){
                Stack<Integer> st=new Stack<>();
                int maxArea=0;
                int n=a.length;
                for(int i=0;i<=n;i++){
                        int h;
                        if(i==n){
                                h=0;
                        }
                        else{
                                h=a[i];
                        }
                        while(!st.isEmpty() && a[st.peek()]){
                                int poppedIndex=st.pop();
                                int height=a[poppedIndex];
                                int width;
                                if(st.isEmpty()){
                                        width=i;
                                }
                                else{
                                        width=i-st.peek()-1;
                                }
                        }
                }
        }
}
