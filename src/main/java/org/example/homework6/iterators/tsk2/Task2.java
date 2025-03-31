package org.example.homework6.iterators.tsk2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ListIterator;

/**
 * Задача 2:
 * Напишите программу, которая читает файл input.txt, заменяет все пробелы на _ и сохраняет в output.txt.
 */
public class Task2 {
    public static void task2(String inputPath, String outputPath) {
        StringBuilder result = new StringBuilder();
        List<String> content;
        Path srcPath = Path.of(inputPath);
        Path dstPath = Path.of(outputPath);
        if (Files.exists(srcPath)) {
            try {
                content = Files.readAllLines(srcPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            ListIterator<String> listIterator = content.listIterator();
            while (listIterator.hasNext()) {
                result.append(listIterator.next().replace(" ", "_") + "\n");
            }
            System.out.println(result);

            try {
                Files.writeString(dstPath,result);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
