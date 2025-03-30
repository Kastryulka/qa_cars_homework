package org.example.homework6.iterators.tsk1;

import java.util.*;

/**
 * Задача 1:
 * Отсортируйте список ["Zebra", "Apple", "Mango"] в обратном алфавитном порядке.
 */
public class Task1 {
    public static List<String> task(ArrayList<String> list) {
        List<String> newList = new ArrayList<>(list);
        newList.sort(Comparator.reverseOrder()); //неинтересное решение
        return newList;
    }
}
