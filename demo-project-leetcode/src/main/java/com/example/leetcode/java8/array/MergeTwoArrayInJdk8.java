package com.example.leetcode.java8.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//merged two unsorted array with  into one without duplicacy
public class MergeTwoArrayInJdk8 {
    public static void main(String str[])
    {
        int array[]={2,3,3,12,45,5,3,4};

        int array2[]={72,73,73,22,40,54,54,33,24,24};

        int merged[]= IntStream.concat(Arrays.stream(array),Arrays.stream(array2)).sorted().distinct().toArray();

        Arrays.stream(merged).forEach(x->System.out.println(x));

        //////////////////operation on character array

       Stream<Character> charray1= Stream.of('a','c','b','d');
        Stream<Character> charray2= Stream.of('f','e','g','h');


        List <Character> combinedStream = Stream.concat(
                charray1, charray2).sorted().toList();
        System.out.println(combinedStream.toString());
/////////////////////////////////////////////////////////////////////merging the two array into one  ///////////////
        int nums1[] = {1,2,3,0,0,0};
        int  nums2[] = {2,5,6};

        //Output: [1,2,2,3,5,6]

        IntStream stream1=Arrays.stream(nums1);
        IntStream stream2=Arrays.stream(nums2);

int [] meregd=IntStream.concat(stream1,stream2).toArray();

System.out.println(Arrays.toString(meregd));

    }

}
