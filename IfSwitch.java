package com.lesson;

import java.util.Scanner;

public class IfSwitch {
    public void testIfSwitch(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char ch = str.charAt(0);

       /* if ( ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' | ch == 'y' ){
            System.out.println("буква гласная");
        } else {
            System.out.println("буква согласная");
        }*/


        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                System.out.println("буква гласная");
                break;
            default:
                System.out.println("буква согласная");

        }
    }

}
