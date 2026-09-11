package stocks;

// Thet Noe(Sky), Partner 1: Volodymyr Surin, Partner 2: Thaneesha

public class StockProfit {

    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }
}