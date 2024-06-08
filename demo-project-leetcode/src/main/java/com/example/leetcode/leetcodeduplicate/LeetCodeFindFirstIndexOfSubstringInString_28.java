package com.example.leetcode.leetcodeduplicate;

import java.util.HashMap;

public class LeetCodeFindFirstIndexOfSubstringInString_28 {
public static void main(String str[])
{
    String haystack = "sadbutsad";
    String needle = "sad";  //check if needle is exist in haystack at first index or not.if it exist return the index.
    String haystack1 = "leetcode";
            String needle1 = "leeto";


    int index= findSubStringIndexInString(haystack1,needle1);

   System.out.println("index is::"+index);
    String str1 = "GeeksforGeeks";
    String str2 = "Geeks";

   findAllOccuranceSubStringIndexInString(str1,str2) ; //find the all occurance of substring in string


}
public static int findSubStringIndexInString(String str,String substr)
{

    //https://www.youtube.com/watch?v=OWaZ6AosS30
    for(int i=0;i<str.length()-substr.length();i++)
    {
        if(str.charAt(i)==substr.charAt(0))
        {
            if(str.substring(i,substr.length()+1).equals(substr))
            {

                return i;
            }
        }
    }
    return -1;
}
    public static void findAllOccuranceSubStringIndexInString(String str,String substr)
    {
        //https://www.geeksforgeeks.org/find-indices-of-all-occurrence-of-one-string-in-other/
        boolean find=false;
        for(int i=0;i<str.length()-substr.length()+1;i++)
        {
            if(str.substring(i,i+substr.length()).equals(substr))
            {
                System.out.println(i+" ");
                find=true;
            }
        }
        if(find==false)
System.out.println("none");
    }

}
