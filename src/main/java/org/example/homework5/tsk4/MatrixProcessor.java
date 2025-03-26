package org.example.homework5.tsk4;

import java.util.HashSet;

/**
 * 4. Сложное: Матрица и множество
 * Задача:
 * Создайте класс MatrixProcessor с методом:
 * public static HashSet<Integer> findUniqueInMatrix(int[][] matrix)
 * Метод должен возвращать уникальные элементы матрицы.
 * Условия:
 * Матрица может быть любого размера.
 */
public class MatrixProcessor {
    public static HashSet<Integer> findUniqueInMatrix(int[][] matrix) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        HashSet<Integer> notUniqueValues = new HashSet<>();

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (!uniqueValues.add(anInt)) {
                    notUniqueValues.add(anInt);
                }
            }
        }
        uniqueValues.removeAll(notUniqueValues);

        return uniqueValues;
    }
}
