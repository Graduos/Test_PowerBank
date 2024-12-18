package com.company;

    public class ZakharovJava_Task3 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            System.out.println("Чётные числа в массиве:");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            }
        }
    }
