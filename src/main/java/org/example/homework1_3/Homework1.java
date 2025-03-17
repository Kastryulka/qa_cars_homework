package org.example.homework1_3;

import java.util.Scanner;

public class Homework1 {
    // через if-else определить месяц
    // вывести название месяца в консоль
    // ввод из консоли, обработка некорректного ввода
    public static void homework1(Scanner scanner) {
        int month = 0;
        boolean a = true; //переменная для выхода из цикла while

        while (a) {
            System.out.println("введите номер месяца");

            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                scanner.skip(".*\n");
            } else {
                a = false;
            }

            if (month == 1) {
                System.out.println("январь\n");
            } else if (month == 2) {
                System.out.println("февраль\n");
            } else if (month == 3) {
                System.out.println("март\n");
            } else if (month == 4) {
                System.out.println("апрель\n");
            } else if (month == 5) {
                System.out.println("май\n");
            } else if (month == 6) {
                System.out.println("июнь\n");
            } else if (month == 7) {
                System.out.println("июль\n");
            } else if (month == 8) {
                System.out.println("август\n");
            } else if (month == 9) {
                System.out.println("сентябрь\n");
            } else if (month == 10) {
                System.out.println("октябрь\n");
            } else if (month == 11) {
                System.out.println("ноябрь\n");
            } else if (month == 12) {
                System.out.println("декабрь\n");
            } else {
                System.out.println("некорректный ввод");
            }

            month = 0;
        }
    }
}
