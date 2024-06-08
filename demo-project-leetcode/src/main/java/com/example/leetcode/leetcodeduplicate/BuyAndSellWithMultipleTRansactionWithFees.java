package com.example.leetcode.leetcodeduplicate;

public class BuyAndSellWithMultipleTRansactionWithFees {
    public static void main(String string[])
    {
        int prices[] = {1,3,2,8,4,9};
        int fee = 2;
        System.out.println(buySellMultipleTRansaction122(prices,fee));
    }

    public static int buySellMultipleTRansaction122SecondWay(int prices[],int fee)
    {
        // https://www.youtube.com/watch?v=ZvRmUqvdO8M

        //big(n)
        int maxProfit=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                maxProfit=maxProfit+prices[i+1]-prices[i];
               maxProfit=maxProfit-fee;
            }
        }
        return maxProfit;
    }
    public static int buySellMultipleTRansaction122(int prices[],int fee)
    {
        //https://www.youtube.com/watch?v=HWJ9kIPpzXs
        //big(n)
        int bd=0;
        int sd=0;
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                sd++;
            }else {
                profit+=prices[sd]-prices[bd];
                sd=bd=i;
            }
        }
        profit+=prices[sd]-fee-prices[bd];
        return profit-fee;
    }
}
