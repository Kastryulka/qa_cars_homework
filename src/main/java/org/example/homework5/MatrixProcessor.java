package org.example.homework5;

import java.util.Arrays;
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

        for (int i = 0; i< matrix.length; i++) {
            for (int j = 0; j< matrix[i].length; j++) {
                uniqueValues.add(matrix[i][j]);
            }
        }
        return uniqueValues;
    }
}
