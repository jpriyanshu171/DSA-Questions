import java.util.Scanner;

public class bestTimeToSellAndBuy2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week days:");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        int ans = maxProfit(prices);
        System.out.println("Max profit is:" + ans);
    }

    public static int maxProfit(int prices[]) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}
