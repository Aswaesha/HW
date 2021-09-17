package com.lesson;

public class SumNambres {
    public void testSumNambres (){
        int[] arra = {5, 2, 3, 1, 4};
        int sum = 0 ;
        int sumTwo = 0;
        for (int i = 0 ; i < arra.length ; i++){
            if( i % 2 == 0) sum += arra[i];
            else {
                sumTwo += arra[i];
            }
        }
        System.out.println(sum-sumTwo);
    }
}
/*Найти разницу между суммой элементов стоящих на четных и нечетных местах.*/