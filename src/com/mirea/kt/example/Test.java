package com.mirea.kt.example;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Нисанов Даниил, РИБО-04-22, Вариант 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу для десериализации: ");
        String path = scanner.nextLine();
        LoaderRunnable lr = new LoaderRunnable(path);
        Thread thr = new Thread(lr);
        thr.start();
    }
}
