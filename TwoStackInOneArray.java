package Stack;

import java.util.Scanner;

public class TwoStackInOneArray {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the array size:");
                int n = sc.nextInt();
                TwoStacks ts = new TwoStacks(n);
                ts.push1(5);
                ts.push1(10);
                ts.push2(15);
                ts.push2(20);
                System.out.println("Popped from stack 1:" + ts.pop1());
                System.out.println("Popped from stack 2:" + ts.pop2());
        }

        public static class TwoStacks {
                int a[];
                int size;
                int top1, top2;

                TwoStacks(int n) {
                        size = n;
                        a = new int[n];
                        top1 = -1;
                        top2 = n;
                }

                void push1(int x) {
                        if (top1 < top2 - 1) {
                                a[++top1] = x;
                        } else {
                                System.out.println("Stack overflow for stack 1");
                        }
                }

                void push2(int x) {
                        if (top1 < top2 - 1) {
                                a[--top2] = x;
                        } else {
                                System.out.println("Stack overflow for stack 2");
                        }
                }

                int pop1() {
                        if (top1 >= 0) {
                                return a[top1--];
                        } else {
                                System.out.println("Stack underflow for stack 1");
                                return -1;
                        }
                }

                int pop2() {
                        if (top2 < size) {
                                return a[top2--];
                        } else {
                                System.out.println("Stack underflow for stack 2");
                                return -1;
                        }
                }
        }
}