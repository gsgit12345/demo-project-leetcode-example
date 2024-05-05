package com.example.leetcode.java8.array;

import java.util.stream.Stream;

public class difforeachandforeachorder {

    public static void main(String str[])
    {
        Stream stream=Stream.of("a","b","c","d","f","g");
        stream.forEach((x)->System.out.println(x));

        Stream stream2=Stream.of("a","b","c","d","f","g");

        stream2.forEachOrdered((x)->System.out.println(x));

////////////////////parallel operation
        Stream<String> stream1=Stream.of("a","b","c","d","f","g");
        stream1.parallel().forEach((x)->System.out.println(x));

        Stream<String> stream3=Stream.of("a","b","c","d","f","g");

        stream3.parallel().forEachOrdered((x)->System.out.println(x));
    }
}
