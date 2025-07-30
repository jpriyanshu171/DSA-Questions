import java.util.*;

public class callByReference {
          public static void main(String[] args) {
                    int a[] = { 1, 2, 3, 4, 5 };
                    System.out.println("Array before");
                    display(a);
                    modify(a);
                    System.out.println("Array after");
          }

          public static void modify(int a[]) {
                    for (int i = 0; i < a.length; i++) {
                              a[i] = a[i] * 2;
                    }
          }

          public static void display(int a[]) {
                    for (int i = 0; i < a.length; i++) {
                              System.out.print(a[i] + " ");
                    }
                    System.out.println();
          }
}
