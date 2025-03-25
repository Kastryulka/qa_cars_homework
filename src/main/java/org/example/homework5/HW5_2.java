package org.example.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 2. Среднее: Поиск уникальных элементов
 * Задача:
 * Напишите программу, которая:
 * Считывает с консоли строки до ввода "end".
 * Добавляет их в HashSet<String> (это автоматически уберет дубли).
 * Выводит количество уникальных строк.
 * *Для строк длиной > 5 проверяет, содержат ли они цифры (используйте charAt и Character.isDigit()).
 * примерный вывод
 * Уникальных строк: 3
 * Строки с цифрами: 123orange
 */
public class HW5_2 {
    private HashSet<String> strings = new HashSet<>();

    public ArrayList<String> getStringsWithDigits() {
        ArrayList<String> strwDigits = new ArrayList<>();
        Iterator<String> i = strings.iterator();
        boolean hasDigit;

        while (i.hasNext()) {
            String nextLine = i.next();
            char[] chars = nextLine.toCharArray();
            hasDigit = false;

            for (char ch : chars) {
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }
            if (nextLine.length() > 5 && hasDigit) {
                strwDigits.add(nextLine);
            }
        }
        return strwDigits;
    }

    public int getUniqueStringsCount () {
        return strings.size();
    }

    public void stringsInput (InputStream in) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String str;
        do {
            try {
                str = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            strings.add(str);
        } while (!str.equals("end"));
    }
}
