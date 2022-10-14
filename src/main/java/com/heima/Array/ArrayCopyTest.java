package com.heima.Array;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] ints = Arrays.copyOf(a, 6);
        for (int val : ints){
            System.out.println(val);
        }
    }
}
