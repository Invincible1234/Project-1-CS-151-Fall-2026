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

        //Angelica's Test Cases
        int[] prices6 = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(s.maxProfit(prices6) == 8);

        int[] prices7 = {1, 2, 1, 2, 1, 2};
        System.out.println(s.maxProfit(prices7) == 3);
        
        int[] prices8 = {5, 5, 5, 5};
        System.out.println(s.maxProfit(prices8) == 0);

        int[] prices9 = {2, 1};
        System.out.println(s.maxProfit(prices9) == 0);

        int[] prices10 = {1, 2};
        System.out.println(s.maxProfit(prices10) == 1);
    }
}
