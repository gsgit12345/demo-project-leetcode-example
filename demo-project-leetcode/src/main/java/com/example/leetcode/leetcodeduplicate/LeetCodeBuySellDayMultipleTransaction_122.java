package com.example.leetcode.leetcodeduplicate;

public class LeetCodeBuySellDayMultipleTransaction_122 {
    public static void main(String str[])
    {
        int prices[] = {7,1,5,3,6,4};// ans=7
        int prices1[] = {1,2,3,4,5};// ans =4
        int prices2[] = {7,6,4,3,1}; //ans =0



        int maxProfit= buySellMultipleTRansaction122(prices2);
        System.out.println("max profit is:::"+maxProfit);
        System.out.println("second way::"+buySellMultipleTRansaction122SecondWay(prices2));

    }
    public static int buySellMultipleTRansaction122(int prices[])
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
        profit+=prices[sd]-prices[bd];
        return profit;
    }
    public static int buySellMultipleTRansaction122SecondWay(int prices[])
    {
       // https://www.youtube.com/watch?v=ZvRmUqvdO8M

        //big(n)
        int maxProfit=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                maxProfit=maxProfit+prices[i+1]-prices[i];
            }
        }
        return maxProfit;
    }

}
