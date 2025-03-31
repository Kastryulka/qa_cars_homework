package org.example.homework6.iterators.tsk3;

import java.util.Comparator;

/**
 * Задача 3 (сложная):
 * Создайте Comparator, который сортирует строки по длине, а при равной длине – лексикографически.
 */
public class Task3 implements Comparator<String>{
    public int compare(String o1, String o2) {
        int len1 = o1.length(), len2 = o2.length();
        if (len1 == len2) {
            for (int i = 0; i<len2; i++){
                if (o1.charAt(i) != o2.charAt(i)) {
                    return o1.charAt(i) - o2.charAt(i);
                }
            }
            return 0;
        }else {return len1 - len2;}
    }
}
