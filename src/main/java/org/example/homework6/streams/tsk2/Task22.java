package org.example.homework6.streams.tsk2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Уровень 2 (Средний)
 * Дан список объектов Person (name, age). Найдите:
 * Самого старшего человека
 * Средний возраст
 * Группировку по возрасту (Map<Integer, List<Person>>)
 * Сгенерируйте 100 случайных чисел и найдите 5 наибольших.
 */
public class Task22 {
    public static Person getOldestPerson(List<Person> personList) {
//        return personList.stream().max((p1, p2) -> p1.getAge() - p2.getAge()).get();
        return personList.stream().max(Comparator.comparingInt(Person::getAge)).get();
    }
    public static double getAverageAge(List<Person> personList) {
        return personList.stream().mapToInt(p -> p.getAge()).average().getAsDouble();
    }
    public static Map<Integer, List<Person>> groupByAge(List<Person> personList) {
        return personList.stream().collect(Collectors.groupingBy(Person::getAge));
    }
    public static List<Integer> getMaxFive(List<Integer> intList) {
        return intList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
    }
}
