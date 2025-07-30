import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Frequencies of array elements:");
        freq(n,a);
    }
    public static void freq(int n, int a[]){
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if (m.containsKey(a[i])){
                m.put(a[i],m.get(a[i])+1);
            }
            else{
                m.put(a[i],1);
            }
        }
        System.out.println(m);
    }
}
// time complexity=O(n)