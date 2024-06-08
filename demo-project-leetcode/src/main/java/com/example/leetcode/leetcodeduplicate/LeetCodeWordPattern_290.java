package com.example.leetcode.leetcodeduplicate;

import java.util.HashMap;

//https://leetcode.com/problems/word-pattern/description/
//290
public class LeetCodeWordPattern_290 {
    public static void main(String str[])
    {
        //https://www.youtube.com/watch?v=b_pNf56VIqY
        String pattern = "abba";
        String s = "dog cat cat dog"; //true
        String pattern1 = "abba";
        String   s1 = "dog cat cat fish"; //false
        String pattern2 = "aaaa";
        String s2 = "dog cat cat dog";



        boolean isMatchedFound= leetCodeWordPattern_290(pattern2,s2);
       System.out.println("match found::"+isMatchedFound);

    }
    public static boolean leetCodeWordPattern_290(String pattern,String str)
    {
        String match[]=str.split(" ");
        if(pattern.length()!=match.length)
            return false;

        HashMap<Character,String> hm=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            Character ch=pattern.charAt(i);
            boolean containsKey=hm.containsKey(ch);

            //key is not present but value is present;
            if(hm.containsValue(match[i]) && !containsKey)
            {
                return false;
            } else if (containsKey && !hm.get(ch).equals(match[i])) {
                return false;

            }else {
                hm.put(ch,match[i]);
            }
        }

        return true;
    }
}
