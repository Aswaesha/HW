package com.lesson;

import java.util.Scanner;

public class Sum {
    public void testSum (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("первое число : " );
        int a = scanner.nextInt();
        System.out.println("второе число ");
        int b = scanner.nextInt();
        int sum = 0 ;
        for (int i = a ;i<= b ;i++){
           if( i % 3 ==0) {
                sum= sum+i;
           }
        }

        System.out.println(sum);


    }
}
