package com.lesson;

import java.util.Scanner;

public class Year {
    public void testYear (){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();


        switch (str){
            case "december":
            case "january":
            case "february":
                System.out.println("This is winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("This is spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("This is summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("This is autumn");
                break;
            default:
                System.out.println("Error");
        }
    }
}
