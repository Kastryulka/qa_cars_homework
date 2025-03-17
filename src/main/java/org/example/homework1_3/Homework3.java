package org.example.homework1_3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    // Задание 1 (легкое):
    // Напишите программу, которая выводит все числа от 1 до 100, которые делятся на 7 без остатка, используя цикл for
    public static void homework31(Scanner scanner) {
        for (int i = 1; i<=100 ;i++) {
            if(i % 7==0) {System.out.println(i);}
        }
    }

    // Задание 2 (среднее):
    // Напишите программу, которая запрашивает у пользователя ввод 10 чисел, сохраняет их в массив, а затем выводит только те числа, которые больше 50.
    // -60 0 10 30 40 50 60 70 80 90
    public static void homework32(Scanner scanner) {
        int arrLength = 10;
        int[] arr = new int[arrLength];

        for (int i = 0; i<arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i : arr) {
            if (i > 50) {
                System.out.println(i);
            }
        }
    }

    // Задание 3 (сложное):
    // Напишите программу, которая создает массив из 20 случайных чисел (от 1 до 100). Программа должна:
    // 1 Вывести все элементы массива.
    // 2 Найти и вывести сумму всех элементов, которые делятся на 3.
    // 3 Прекратить выполнение, если сумма превысит 100.
    public static void homework33(Scanner scanner) {
        Random random = new Random();
        int min = 1, max = 100;
        int arrLength = 20;
        int divider = 3; // делитель
        int summ = 0; // сумма элементов массива, которые без остатка делятся на divider
        int[] arr = new int[arrLength];

        for (int i = 0; i<arrLength; i++) {
            arr[i] = random.nextInt(max - min +1) + min;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; summ < 100; i++) {
            if (arr[i] % divider == 0) {
                System.out.print(summ + " + " + arr[i] + " = ");
                summ = summ + arr[i];
                System.out.println(summ);
            }
        }
    }

    // Дз матрицы
    // Задание 1 (легкое):
    // Создайте двумерный массив размером 3x3, заполните его числами от 1 до 9 и выведите его на экран в виде таблицы.
    public static void homework34(Scanner scanner) {
        int arrLength = 3;
        int[][] arr = new int[arrLength][arrLength];
        int count = 1; //для заполнения числами от 1 до 9

        System.out.println("заполнение массива: ");
        for (int i = 0; i<arrLength; i++) {
            for (int i2 = 0; i2<arrLength; i2++) {
                arr[i][i2] = count;
                System.out.print(arr[i][i2] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("вывод массива: ");
        for (int[] row : arr) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // Задание 2 (среднее):
    // Напишите программу, которая находит минимальный элемент в каждой строке двумерного массива и выводит их.
    public static void homework35(Scanner scanner) {
        int[][] arr = {
                {-10, 0, 10},
                {0, 5, 20},
                {-100, -50, -10}
        };
        int minValue;

        System.out.println("вывод массива: ");
        for (int[] row : arr) {
            minValue = row[0];
            for (int i : row) {
                if (i < minValue) {
                    minValue = i;
                }
                System.out.print(i + " ");
            }
            System.out.println("минимальное значение = " + minValue);
        }
    }
    // Задание 3 (сложное):
    // Напишите программу, которая умножает две матрицы размером 2x2. Результат выведите на экран.
    public static void homework36(Scanner scanner) {
        int[][] arr1 = {
                {9, -6},
                {6, -4}
        };
        int[][] arr2 = {
                {2, -3},
                {4, -6}
        };
        System.out.println("""
               ожидаемый результат:
               -6 9
               -4 6
               """);
///////////////////////////////////////////////////////////////////
//        int[][] arr1 = {
//                {5, 8, -4},
//                {6, 9, -5},
//                {4, 7, -3}
//        };
//        int[][] arr2 = {
//                {3, 2, 5},
//                {4, -1, 3},
//                {9, 6, 5}
//        };
//        System.out.println("""
//               ожидаемый результат:
//               11 -22 29
//               9 -27 32
//               13 -17 26
//               """);
///////////////////////////////////////////////////////////////////
//        int[][] arr1 = {
//                {5, 8, -4},
//                {6, 9, -5},
//                {4, 7, -3}
//        };
//        int[][] arr2 = {
//                {3, 2},
//                {4, -1},
//                {9, 6}
//        };
//        System.out.println("""
//               ожидаемый результат:
//               11 -22
//               9 -27
//               13 -17
//               """);
/////////////////////////////////////////////////////////////////
//        int[][] arr1 = {
//                {5, 8, -4},
//                {6, 9, -5},
//                {4, 7, -3}
//        };
//        int[][] arr2 = {
//                {2},
//                {-3},
//                {1}
//        };
//        System.out.println("""
//               ожидаемый результат:
//               -18
//               -20
//               -26
//               """);
///////////////////////////////////////////////////////////////////
//        int[][] arr1 = {
//                {5, 8, -4},
//                {6, 9, -5},
//                {4, 7, -3}
//        };
//        int[][] arr2 = {
//                {3, 2},
//                {4, -1}
//        };
//        System.out.println("ожидаемый результат: ошибка");
        int row = arr1[0].length, col = arr2[0].length;
        if (arr1[0].length == arr2.length) {
            int[][] arr3 = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int i2 = 0; i2 < col; i2++) {
                    for (int i3 = 0; i3 < arr2.length; i3++) {
                        arr3[i][i2] = arr3[i][i2] + (arr1[i][i3] * arr2[i3][i2]);
                    }
                }
            }

            System.out.println("вывод результирующей матрицы: ");
            for (int[] rows : arr3) {
                for (int i : rows) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ошибка, число столбцов матрицы 1 должно равняться числу строк матрицы 2");
        }
    }

    public static void homework37(Scanner scanner) {}
}
