package com.company;

import java.util.Scanner;
public class ZakharovJava_Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = b != 0 ? (double) a / b : Double.NaN;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + (b != 0 ? quotient : "Деление на ноль"));

        scanner.close();
    }
}