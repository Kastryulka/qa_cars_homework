package org.example.homework1_3;

import java.util.Scanner;

public class Homework2 {
    // размеры фигур получать из консоли
    /*0. вывести треугольник
    #
    ##
    ###
    ####
    #####
     ----
    1. вывести полый квадрат
    #####
    #   #
    #   #
    #   #
    #####

    2.вывести паримиду
       #
      ###
     #####
    #######

    3.вывести полую паримиду
       #
      # #
    #     #
    #######

    4.вывести перевернутую паримиду
    #######
     #####
      ###
       #
       */
    public static void homework2(Scanner scanner) {
        boolean isInputCorrect = false;
        int width = 0; //ширина основания фигуры
        int hight = 0; //высота фигуры (для пирамид)
        int countX = 0; //счетчик для отрисовки по горизонтали
        int countY = 0; //счетчик для отрисовки по вертикали
        int spaceCounter; //счетчик для отступов
        while (!isInputCorrect) {
            System.out.println("введите ширину основания (число должно быть нечетным)");
            width = scanner.nextInt();
            if (width % 2 != 0) {
                isInputCorrect = true;
            } else {
                System.out.println("ошибка, введите нечетное число");
            }
        }
        System.out.println("ширина основания: " + width);
        spaceCounter = width / 2;
        hight = spaceCounter + 1;

        //вывод треугольника
        System.out.println("вывод треугольника");
        while (countX < width) {
            while (countY < countX + 1) {
                System.out.print("#");
                countY++;
            }
            countY = 0;
            System.out.println();
            countX++;
        }

        //вывод полого квадрата
        countX = 0;
        countY = 0;
        System.out.println("вывод полого квадрата");
        while (countX < width) {
            while (countY < width) {
                if (countY == 0
                        || countX == 0
                        || countX == width - 1
                        || countY == width - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                countY++;
            }

            countY = 0;
            System.out.println();
            countX++;
        }

        //вывод пирамиды
        countX = 0;
        countY = 0;
        System.out.println("вывод пирамиды");
        while (countY < hight) {
            //сюда бы цикл for...
            while (countX < spaceCounter) {
                System.out.print(" ");
                countX++;
            }
            while (countX < (width - spaceCounter)) {
                System.out.print("#");
                countX++;
            }
            while (countX < width) {
                System.out.print(" ");
                countX++;
            }

            countX = 0;
            spaceCounter--;
            System.out.println();
            countY++;
        }

        //вывод полой пирамиды
        countX = 0;
        countY = 0;
        spaceCounter = width / 2;
        System.out.println("вывод полой пирамиды");
        while (countY < hight) {
            //сюда бы цикл for...
            while (countX < spaceCounter) {
                System.out.print(" ");
                countX++;
            }
            while (countX < (width - spaceCounter)) {
                if (countX == spaceCounter
                        || spaceCounter == width - countX - 1
                        || countY == hight - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                countX++;
            }
            while (countX < width) {
                System.out.print(" ");
                countX++;
            }

            countX = 0;
            spaceCounter--;
            System.out.println();
            countY++;
        }

        //вывод перевернутой пирамиды
        countX = width;
        countY = 0;
        spaceCounter = 0;
        System.out.println("вывод перевернутой пирамиды");
        while (countY < hight) {
            //сюда бы цикл for...
            int innerCount = 0; //счетчик для отступов в начале строки
            while (innerCount < spaceCounter) {
                System.out.print(" ");
                countX--;
                innerCount++;
            }
            while (countX > spaceCounter) {
                System.out.print("#");
                countX--;
            }

            countX = width;
            spaceCounter++;
            System.out.println();
            countY++;
        }
    }
}
