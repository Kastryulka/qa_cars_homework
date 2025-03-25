package org.example.homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import static org.example.homework5.HW5_3.getFrequencyDictionary;
import static org.example.homework5.MatrixProcessor.findUniqueInMatrix;

public class Homework5 {
    public static void testHW5_1() {}
    public static void testHW5_2() {
//        HW5_2.getStringsWithDigits();
    }
    public static void testHW5_3() {
        String[] testDataArr = {"apple", "banana", "apple", "cherry"};
        ArrayList<String> testData = new ArrayList<String>();
        Collections.addAll(testData, testDataArr);
        System.out.println(getFrequencyDictionary(testData));
    }
    public static void testHW5_4() {
        int[][] testData = {{2, 3}, {3, 2}};
        HashSet<Integer> uniqueInMatrix = findUniqueInMatrix(testData);
        System.out.println(uniqueInMatrix);
    }
    public static void testHW5_5() {}
    public static void testHW5_6() {}
}
