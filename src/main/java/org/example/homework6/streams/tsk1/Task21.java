package org.example.homework6.streams.tsk1;

import java.util.List;
import java.util.stream.Stream;

/**
 * Уровень 1 (Начальный)
 * Дан список строк. Отфильтруйте строки длиной более 5 символов и преобразуйте их в верхний регистр.
 * Для списка чисел вычислите среднее значение.
 */
public class Task21 {
    public static Stream<String> task21(List<String> inputStrings) {
       return inputStrings.stream()
                .filter(s -> s.length() > 5)
                .map(String::toUpperCase);
    }

    public static double average (List<Integer> inputStrings) {
//        return (double) inputStrings.stream().reduce(0, Integer::sum) / inputStrings.size();
        return inputStrings.stream().mapToInt(e -> e).average().getAsDouble();
    }
}
