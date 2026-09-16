package test;

import stocks.StockProfit;

public class StockProfitTest {
    public static void main(String[] args) {
        StockProfit s = new StockProfit();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(s.maxProfit(prices1) == 7);

        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println(s.maxProfit(prices2) == 4);

        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println(s.maxProfit(prices3) == 0);

        int[] prices4 = {};
        System.out.println(s.maxProfit(prices4) == 0);

        int[] prices5 = {1};
        System.out.println(s.maxProfit(prices5) == 0);
    }
}
