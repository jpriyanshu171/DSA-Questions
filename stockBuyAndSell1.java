public class stockBuyAndSell1 {
    public int maxProfit(int prices[]) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        stockBuyAndSell1 a = new stockBuyAndSell1();
        System.out.println(a.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
