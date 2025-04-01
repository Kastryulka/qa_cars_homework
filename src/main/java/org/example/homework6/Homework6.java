package org.example.homework6;

import org.example.homework6.iterators.tsk1.Task1;
import org.example.homework6.iterators.tsk2.Task2;
import org.example.homework6.iterators.tsk3.Task3;
import org.example.homework6.streams.tsk1.Task21;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Homework6 {
    public static void test11() {
        ArrayList<String> testData = new ArrayList<>();
        testData.add("Zebra");
        testData.add("Apple");
        testData.add("Mango");
        testData.add("123");
        testData.add("");

        List<String> result = Task1.task(testData);
        System.out.println(result);
    }
    public static void test12() {
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
    }
    public static void test13() {
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
        System.out.println(testData);
    }
    public static void test21() {
        List<String> testDataStr = new ArrayList<>();
        testDataStr.add("1");
        testDataStr.add("три");
        testDataStr.add("");
        testDataStr.add("       ");
        testDataStr.add("123456");
        testDataStr.add("десять сим");
        System.out.println(Task21.task21(testDataStr).collect(Collectors.toList()));

        List<Integer> testDataInt = new ArrayList<>();
        testDataInt.add(1);
        testDataInt.add(5);
        testDataInt.add(10);
        testDataInt.add(33);
        testDataInt.add(0);
        System.out.println(Task21.average(testDataInt)); // 49 / 5 = 9,8
    }
    public static void test22() {}
    public static void test23() {}
}
