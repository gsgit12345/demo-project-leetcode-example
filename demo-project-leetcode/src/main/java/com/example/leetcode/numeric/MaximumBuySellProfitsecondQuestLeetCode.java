package com.example.leetcode.numeric;

//https://workat.tech/problem-solving/approach/bttbassi/best-time-to-buy-and-sell-stock-ii
//https://www.youtube.com/watch?v=HWJ9kIPpzXs
//https://medium.com/@punitkmr/best-time-to-buy-and-sell-stock-ii-7826845144eb
public class MaximumBuySellProfitsecondQuestLeetCode {
    public static void main(String str[])
    {
        int prices[] = {7,1,5,3,6,4};
        //ans:-7
        int prices1[] = {1,2,3,4,5};
        //Output: 4
        int []prices2 = {7,6,4,3,1};
//outpu:-0;
        System.out.println(  bestBuySellInMultipleTransaction(prices2));
    }
    public static int bestBuySellInMultipleTransaction(int prices[])
    {
        int max_profit=0;
        int bd=0;
        int sd=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                max_profit+=prices[i]-prices[i-1];
            }
        }
        return max_profit;
    }
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int bd=0;
        int sd=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>=prices[i-1])
            {
                bd++;
            }else
            {
                max_profit+=prices[bd]-prices[sd];
                bd=sd=i;
            }
        }
        max_profit+=prices[bd]-prices[sd];
        return max_profit;

    }


}
