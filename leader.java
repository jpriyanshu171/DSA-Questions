public class leader {
          void printLetters(int a[], int n) {
                    int mfr = a[n - 1];
                    System.out.println(mfr + " ");
                    for (int i = n - 2; i >= 0; i--) {
                              if (mfr < a[i]) {
                                        mfr = a[i];
                                        System.out.println(mfr + " ");
                              }
                    }
          }

          public static void main(String[] args) {
                    leader l = new leader();
                    int a[] = { 16, 17, 4, 3, 5, 2 };
                    int n = a.length;
                    l.printLetters(a, n);
          }
}

// time complexity is O(N) and space complexity is also O(N)