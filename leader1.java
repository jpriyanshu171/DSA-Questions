public class leader1 {
          void printLeaders(int a[], int n) {
                    for (int i = 0; i < n; i++) {
                              int j;
                              for (j = i + 1; j < n; j++) {
                                        if (a[i] <= a[j]) {
                                                  break;
                                        }
                              }
                              if (j == n) {
                                        System.out.println(a[i] + " ");
                              }
                    }
          }

          public static void main(String[] args) {
                    leader1 l1 = new leader1();
                    int a[] = { 16, 17, 4, 3, 5, 2 };
                    int n = a.length;
                    l1.printLeaders(a, n);
          }
}
