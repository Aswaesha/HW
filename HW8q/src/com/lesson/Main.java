package com.lesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataService service = new LocalMemoryDataService();

        while (true){
            String next = scanner.next();
            if ("exit".equals(next)){
                break;
            } else if ("get".equals(next)){
                try {
                    System.out.println(service.get());
                } catch (NoSuchElementException e){
                    System.out.println("No elements");
                }

            } else {
                try {
                    service.add(next);
                } catch (LowMemoryException e){
                    System.out.println("memory is full");
                }
            }
        }
    }
}
