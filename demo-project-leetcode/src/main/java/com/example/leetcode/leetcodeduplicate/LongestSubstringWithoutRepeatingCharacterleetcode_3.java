package com.example.leetcode.leetcodeduplicate;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacterleetcode_3 {
    public static void main(String str[])
    {
        //n*(n+1)/lenthofstring   ==total substring
        //https://www.geeksforgeeks.org/length-of-the-longest-substring-without-repeating-characters/

        String s= "abcabcbb"; //ans--3
        String s1 = "bbbbb";  //ans ---1
        String s2 = "pwwkew"; //ans==3

        System.out.println(longestSubstringWithoutRepeatingCharacter(s2));

        System.out.println(longestSubstringUsingList(s2));

    }

    public static  int longestSubstringWithoutRepeatingCharacter(String st)
    {
       // https://www.youtube.com/watch?v=-vEDQptL3Yk&t=578s
        //slidng window approach and acuire and release strategy
        int start=0;
        int left=-1;
        int max_length=0;
        int cur_length=0;
        boolean [] visited=new boolean[256];

        while(start<st.length())
        {
            char char_to_acuire=st.charAt(start);

            //check the duplicacy and release the duplicate character from the boolean array and mark them false if found duplicate
            if(visited[char_to_acuire]==true)
            {
                while (visited[char_to_acuire]==true) {
                    left++;

                    visited[st.charAt(left)]=false;
                }
            }
            //acuire the character in the set
            visited[char_to_acuire]=true;

            cur_length=start-left;
            if(cur_length>max_length)
            {
                max_length=cur_length;
            }
            start++;

        }
        return max_length;
    }
    public static int longestSubstringUsingList(String st)
    {
        //https://www.youtube.com/watch?v=VvS_CtSIeiQ
        //big(n)
        //big(1)
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> map=new ArrayList<>();
        while(start<st.length())
        {
            Character aquire=st.charAt(start);
            if(!map.contains(aquire))
            {
                map.add(aquire);
                start++;
            }else {
                map.remove(Character.valueOf(st.charAt(end)));
                end++;
            }
            max_length=Math.max(max_length,start-end);
        }
        return max_length;
    }
}
