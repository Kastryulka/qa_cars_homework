package org.example.homework6;

import org.example.homework6.iterators.tsk1.Task1;
import org.example.homework6.iterators.tsk2.Task2;
import org.example.homework6.iterators.tsk3.Task3;
import org.example.homework6.streams.tsk1.Task21;
import org.example.homework6.streams.tsk2.Person;
import org.example.homework6.streams.tsk2.Task22;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Homework6 {
    public static void test11() {
        System.out.println("итераторы компараторы 1 таска");
        ArrayList<String> testData = new ArrayList<>();
        testData.add("Zebra");
        testData.add("Apple");
        testData.add("Mango");
        testData.add("123");
        testData.add("");

        List<String> result = Task1.task(testData);
        System.out.println(result + "\n");
    }
    public static void test12() {
        System.out.println("итераторы компараторы 2 таска");
        String srcPath = "src/main/java/org/example/homework6/iterators/tsk2/input.txt";
        String dstPath = "src/main/java/org/example/homework6/iterators/tsk2/output.txt";
        String testData =
                """
                Ливень грозовой!
                За траву чуть держится
                Стайка воробьёв.
                """;
        try {
            OutputStream output = Files.newOutputStream(Path.of(srcPath));
            output.write(testData.getBytes());
            output.close();
            Files.deleteIfExists(Path.of(dstPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Task2.task2(srcPath, dstPath);
        System.out.println("записалось, проверяй\n");
    }
    public static void test13() {
        System.out.println("итераторы компараторы 3 таска");
        List<String> testData = new ArrayList<>();
        testData.add("Бирюльки");
        testData.add("Бирюльки");
        Collections.sort(testData, new Task3());
        System.out.println(testData);
        testData.add("Бирюлька");
        testData.add("Авокадо");
        Collections.sort(testData, new Task3());
        System.out.println(testData);
        testData.add("");
        testData.add(" ");
        testData.add("123");
        Collections.sort(testData, new Task3());
        System.out.println(testData + "\n");
    }
    public static void test21() {
        System.out.println("стримы 1 таска");
        List<String> testDataStr = new ArrayList<>();
        testDataStr.add("1");
        testDataStr.add("три");
        testDataStr.add("");
        testDataStr.add("       ");
        testDataStr.add("123456");
        testDataStr.add("десять сим");
        System.out.println("отфильтрованные строки: " + Task21.task21(testDataStr).collect(Collectors.toList()));

        List<Integer> testDataInt = new ArrayList<>();
        testDataInt.add(1);
        testDataInt.add(5);
        testDataInt.add(10);
        testDataInt.add(33);
        testDataInt.add(0);
        System.out.println("среднее для списка чисел: " + Task21.average(testDataInt) + "\n"); // 49 / 5 = 9,8
    }
    public static void test22() {
        System.out.println("стримы 2 таска");
        List<Person> testDataPersons = new ArrayList<>();
        testDataPersons.add(new Person("Персона1", 10));
        testDataPersons.add(new Person("Персона2", 0));
        testDataPersons.add(new Person("Персона3", -10));
        testDataPersons.add(new Person("Персона4", 100));
        testDataPersons.add(new Person("Персона5", 27));
        System.out.println("самый старший человек: " + Task22.getOldestPerson(testDataPersons));
        System.out.println("средний возраст: " + Task22.getAverageAge(testDataPersons)); //127 / 5 = 25,4
        testDataPersons.add(new Person("Персона6", 100));
        testDataPersons.add(new Person("Персона7", 27));
        testDataPersons.add(new Person("Персона8", 100));
        testDataPersons.add(new Person("Персона9", 27));
        testDataPersons.add(new Person("Персона10", 100));
        testDataPersons.add(new Person("Персона11", 27));
        Map<Integer, List<Person>> map= Task22.groupByAge(testDataPersons);
        System.out.println("группировка по возрасту: " + map);
        List<Integer> testDataInt = new Random().ints(100, -100, 100).boxed().toList();
        List<Integer> resultListInt = Task22.getMaxFive(testDataInt);
        System.out.println("5 наибольших чисел из ста: " + resultListInt + "\n");
    }
    public static void test23() {
        System.out.println("стримы 3 таска");
    }
}
