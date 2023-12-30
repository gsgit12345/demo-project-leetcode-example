package com.example.leetcode.numeric;

public class LongestCommonPrefixInStringArrayLeetCode {
    //https://www.youtube.com/watch?v=XX4ikVj6Bug
    //https://www.youtube.com/watch?v=K5I7aUK9LVU
    //https://medium.com/@AlexanderObregon/solving-the-longest-common-prefix-problem-on-leetcode-a-java-walkthrough-dd7efa5c0b9f#:~:text=Step%201%3A%20If%20the%20input,strings%20or%20it%20becomes%20empty.
    public static void main(String str[])
    {
        String strs[] = {"flower","flow","flight"};
        String  strs1[] = {"dog","racecar","car"};

        String result= findLongestPrefixInStringArray(strs1);
       System.out.println("result is:::"+result);
    }
    public static String findLongestPrefixInStringArray(String str[])
    {
        String result=str[0];
        for(int i=1;i<str.length;i++)
        {
            result=commonString(result,str[i]);
        }
        return result;
    }
    public static String commonString(String first,String second)
    {
        StringBuffer stringBuffer=new StringBuffer();
        int minLength=Math.min(first.length(),second.length());
        for(int i=0;i<minLength;i++)
        {
            if(first.charAt(i)==second.charAt(i))
            {
                stringBuffer.append(first.charAt(i));
            }
            else
                break;
        }
        return stringBuffer.toString();
    }
}
