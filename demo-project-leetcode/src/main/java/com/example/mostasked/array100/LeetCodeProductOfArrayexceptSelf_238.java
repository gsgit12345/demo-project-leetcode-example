package com.example.mostasked.array100;

import java.util.Arrays;

public class LeetCodeProductOfArrayexceptSelf_238 {
    public static void main(String str[]) {
        int nums[] = {1, 2, 3, 4};
        //24,12,8,6
        //  Ans: [24,12,8,6]
        int nums1[] = {-1, 1, 0, -3, 3};
        // Ans: [0,0,9,0,0]
        //  int res[] = productOfArrayExceptSelfNaive(nums);
        int res[] = productOfArrayExceptSelfBigN(nums);
        System.out.println(Arrays.toString(res));
        //  https://www.youtube.com/watch?v=TW2m8m_FNJE&t=83s
    }

    public static int[] productOfArrayExceptSelfNaive(int array[]) {
        int res[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            // int product = 1; //do not initialize it outside of this loop
            res[i] = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    res[i] *= array[j];
                }
            }
            // res[i] = product;
        }
        return res;
    }

    public static int[] productOfArrayExceptSelfBigN(int array[]) {

        int prefix[] = new int[array.length];
        int suffix[] = new int[array.length];
        int result[] = new int[array.length];
        prefix[0] = 1;
        suffix[array.length - 1] = 1;
        for (int i = 1; i <= array.length - 1; i++) {
            prefix[i] = array[i - 1] * prefix[i - 1];
        }
        System.out.println(Arrays.toString(prefix));
        for (int i = array.length - 2; i >= 0; i--) {
            //        int nums[] = {1, 2, 3, 4};
            suffix[i] = array[i + 1] * suffix[i + 1];
        }
        for (int j = 0; j < array.length; j++) {
            result[j] = prefix[j] * suffix[j];
        }
        System.out.println(Arrays.toString(suffix));
        System.out.println("result is:;" + Arrays.toString(result));
        return null;
    }
}
