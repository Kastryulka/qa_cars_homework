package org.example.homework5;

import org.example.homework5.tsk1.Student;
import org.example.homework5.tsk2.Tsk2;
import org.example.homework5.tsk5.Book;
import org.example.homework5.tsk5.Library;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import static org.example.homework5.tsk3.Tsk3.getFrequencyDictionary;
import static org.example.homework5.tsk4.MatrixProcessor.findUniqueInMatrix;
import static org.example.homework5.tsk6.Tsk6.playGame;

public class Homework5 {
    public static void testHW5_1() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Первый", 20,  new ArrayList<Integer>()));
        students.get(0).addGrade(30);
        students.get(0).addGrade(40);
        students.get(0).addGrade(50);
        System.out.println("средняя оценка Первого " + students.get(0).getAverageGrade());

        students.add(new Student("Второй", 21,  new ArrayList<Integer>()));
        students.get(1).addGrade(30);
        students.get(1).addGrade(30);
        students.get(1).addGrade(30);
        System.out.println("средняя оценка Второго " + students.get(1).getAverageGrade());

        students.add(new Student("Третий", 21,  new ArrayList<Integer>()));
        students.get(2).addGrade(20);
        System.out.println("средняя оценка Третьего " + students.get(2).getAverageGrade());
    }
    public static void testHW5_2() {
        //тут мб тупняк с "уникальные", если имеется в виду "удалить дубли", то ок
        String testData = "qwe\n" +
                "asd1\n" +
                "zxc2121\n" +
                "123\n" +
                "123456\n" +
                "qwe\n" +
                "qwe321\n" +
                "qwe\n" +
                "\n" +
                "\n" +
                "end";
        Tsk2 tsk2 = new Tsk2();
//        tsk2.stringsInput(System.in);
        tsk2.stringsInput(new ByteArrayInputStream(testData.getBytes()));
        System.out.println("Уникальных строк: " + tsk2.getUniqueStringsCount());
        System.out.println("Строки с цифрами: "+ tsk2.getStringsWithDigits());
    }
    public static void testHW5_3() {
        String[] testDataArr = {"apple", "banana", "apple", "cherry", "", "cherry", "cherry", null};
        ArrayList<String> testData = new ArrayList<String>();
        Collections.addAll(testData, testDataArr);
        System.out.println(getFrequencyDictionary(testData));
    }
    public static void testHW5_4() {
        int[][] testData = {{2, 3, 4, 5}, {3, 2, 1 , 0}};
        HashSet<Integer> uniqueInMatrix = findUniqueInMatrix(testData);
        System.out.println(uniqueInMatrix);
    }
    public static void testHW5_5() {
        Library lib = new Library();
        lib.addBook("978-5-17-110592-1", new Book("Не время для драконов","Сергей Лукьяненко", 2021));
        lib.addBook("978-5-17-110592-1", new Book("Не время для драконов","Ник Перумов", 2021));
        lib.addBook("978-5-17-099431-1", new Book("Лабиринт отражений","Сергей Лукьяненко", 2023));
        lib.addBook("978-5-222-36611-0", new Book("Алмазный Меч, Деревянный Меч (цел.)","Ник Перумов", 2022));
        lib.addBook("978-5-222-36608-0", new Book("Гибель Богов (цел.)","Ник Перумов", 2022));
        lib.addBook("978-5-222-36615-8", new Book("Империя превыше всего: Книга 1. Череп на рукаве. Книга 2. Череп в небесах","Ник Перумов", 2023));
        lib.addBook("978-5-222-36613-4", new Book("Черное копье","Ник Перумов", 2023));
        System.out.println(lib.getBooks());

        lib.removeBook("978-5-222-36615-8");
        System.out.println(lib.getBooks());

        System.out.println(lib.findBooksByAuthor("Ник Перумов"));
        System.out.println(lib.findBooksByAuthor("Сергей Лукьяненко"));
    }
    public static void testHW5_6() {playGame(System.in);}
}
