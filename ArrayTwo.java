package com.lesson;

import java.util.Arrays;

public class ArrayTwo {
    public void testArrayTwo() {
        int[] arr = {5, 2, 3, 1, 4};
        boolean isSorted = false;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i = i + 1) {
                int max = arr[i];
                if (max > arr[i + 1]) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = max;

                }
            }


        }
       System.out.println(Arrays.toString(arr));}
}
