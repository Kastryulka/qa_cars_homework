package org.example.homework5.tsk3;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 3. Среднее+: Частотный словарь
 * Задача:
 * Дан ArrayList<String> со словами (например: ["apple", "banana", "apple", "cherry"]).
 * Напишите программу, которая создает HashMap<String, Integer>, где ключ — слово, а значение — сколько раз оно встречается.
 */
public class Tsk3 {
    public static HashMap<String, Integer> getFrequencyDictionary (ArrayList<String> words) {
        HashMap<String, Integer> freqDict = new HashMap<>();

        // для каждого из ArrayList<String> - добавляем ключ в HashMap<String, Integer> со значением
        // 0 - по умолчанию, если ключа еще нет в мапе
        // значение ключа + 1 - если ключ уже есть в мапе
        // значение пары перезаписывается при нахождении нового вхождения
        for (String i : words) {freqDict.put(i, freqDict.getOrDefault(i,0) + 1);}
        return freqDict;
    }
}
