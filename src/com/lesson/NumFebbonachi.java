package com.lesson;

import java.util.Arrays;

public class NumFebbonachi {
    public void testNumFebbonachi() {

        /*Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();*/

        int[] arr = new int[10];

        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

        }
            System.out.print(Arrays.toString(arr));
    }
}

