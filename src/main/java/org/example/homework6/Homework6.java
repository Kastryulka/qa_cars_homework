package org.example.homework6;

import org.example.homework6.iterators.tsk1.Task1;
import org.example.homework6.iterators.tsk2.Task2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Homework6 {
    public static void test11() {
        ArrayList<String> testData = new ArrayList<>();
        testData.add("Zebra");
        testData.add("Apple");
        testData.add("Mango");
        testData.add("123");
        testData.add("");

        List<String> result = Task1.task(testData);
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
    public static void test13() {}
    public static void test21() {}
    public static void test22() {}
    public static void test23() {}
}
