package com.example.leetcode.leetcodeduplicate;

public class LeetCodeBuySellInOneTransactionNotsameday_121 {
    /*
    Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


     */
    public static void main(String str[])
    {
        int prices[] = {7,1,5,3,6,4};          //output  5

        int prices2[] = {7,6,4,3,1};

        int maxProfit= buySellInOneTRansaction121(prices2);
       System.out.println("max profit in oneday::"+maxProfit);

     maxProfit=   buySellInOneTRansaction121Secondway(prices2);
        System.out.println("max profit in oneday::"+maxProfit);

    }
    public static int buySellInOneTRansaction121(int prices[])
    {
        //https://www.youtube.com/watch?v=4YjEHmw1MX0

        int length=prices.length;
        int leastProfit=Integer.MAX_VALUE;
        int overallProfit=0;
        int oneDayMaxProfit=0;
        for(int i=0;i<length;i++)
        {
            if(prices[i]<leastProfit)
            {
                leastProfit=prices[i];
            }
            oneDayMaxProfit=prices[i]-leastProfit;
            if(overallProfit<oneDayMaxProfit)
            {
                overallProfit=oneDayMaxProfit;
            }
        }
        return  overallProfit;
    }
    public static int buySellInOneTRansaction121Secondway(int prices[])
    {
        int max_profit=0;
        int leastProfit=Integer.MAX_VALUE;
        int profit=0;
        for(int price:prices)
        {
            leastProfit=Math.min(price,leastProfit);

            profit=price-leastProfit;
            max_profit=Math.max(profit,max_profit);
        }

        return  max_profit;
    }
}
