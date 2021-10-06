package com.lesson;

import java.util.Objects;

import java.util.Scanner;

public class Word {
    public void testWord() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if (str.equals("exit")) {
            System.out.println("Программа окончена");
        } else {
            System.out.println("Введите следующее слово");
            Scanner scanner2 = new Scanner(System.in);
            String str2 = scanner2.next();
        }
    }
}
