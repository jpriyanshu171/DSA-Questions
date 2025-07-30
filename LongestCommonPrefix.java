package String;

import java.util.Scanner;

public class LongestCommonPrefix {
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number of strings:");
                int n=sc.nextInt();
                String a[]=new String[n];
                System.out.println("Enter the strings:");
                for(int i=0;i<a.length;i++){
                        a[i]=sc.nextLine();
                }
                String result=longestCommonPrefix(a);
        }
        public static String longestCommonPrefix(String a[]){
                if (a == null || a.length == 0) {
                        return "";
                }
                String prefix=a[0];
                for(int i=1;i<a.length;i++){
                        while(!a[i].isEmpty()){
                                prefix=prefix.substring(0,prefix.length()-1);
                                if(prefix.isEmpty()){
                                        return "";
                                }
                        }
                }
                return prefix;
        }
}
