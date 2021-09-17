package com.lesson;

public class SumNambres {
    public void testSumNambres (){
        int arr[] = {5, 2, 3, 1, 4};
        int sum = 0 ;
        int sumTwo = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if( i % 2 == 0) {
                sum += arr[i];
            } else {
                sumTwo += arr[i];;
            }
        }
        System.out.println(sum-sumTwo);
    }
}
