package org.example.homework5.tsk6;

import java.io.*;
import java.util.*;

/**
 * 6. Очень сложное: Игра в слова
 * Задача:
 * Напишите игру, где:
 * Компьютер загадывает слово (храните слова в ArrayList<String>).
 * Игрок угадывает буквы.
 * Используйте HashSet<Character> для учета уже названных букв.
 * Логика:
 * Дается 10 попыток.
 * При неверной букве счетчик уменьшается.
 * При вводе некорректных данных (не буква или больше 1 символа) обрабатывайте возможные исключения чтобы игра не прервалась и счетчик не уменьшился
 * Доп. задание:
 * Реализуйте подсказку: выводите буквы, которые еще не назывались.
 */
public class Tsk6 {
    private static ArrayList<String> words = new ArrayList<>();
    static {
        words.add("повар");
        words.add("спрашивает");
        words.add("повара");
    }
    private static final int ATTEMPT = 10; //количество попыток
    private static HashSet<Character> namedLetters = new HashSet<>(); //нет смысла использовать HashSet для уже отгаданных букв из-за уникальности элементов. А если в слове повторяются буквы?

    public static void playGame(InputStream in) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String word = getNewWord();
        String playerInput;
        boolean keepPlaying = true;
        int attempt = ATTEMPT;
        int pointer = 0;

        System.out.println("игра началась, назови букву");

        while (keepPlaying) {
            playerInput = stringInput(reader);
            if(playerInput!=null && playerInput.length() == 1 && playerInput.matches("[А-Яа-яЁё]")) {
                playerInput = playerInput.toLowerCase();
                if(word.charAt(pointer) == playerInput.charAt(0)) {
                    pointer++;
                    namedLetters.clear();
                    System.out.println("успех, осталось " + (word.length() - pointer) + " букв");
                } else {
                    if (namedLetters.contains(playerInput.charAt(0))){
                        System.out.println("эта буква уже называлась, попробуй другую");
                    } else {
                        attempt--;
                        namedLetters.add(playerInput.charAt(0));
                        System.out.println("ошибка, назови другую букву");
                    }
                    System.out.println("уже названы буквы: " + namedLetters);
                }
            } else if(playerInput != null && playerInput.equalsIgnoreCase("новая игра")) {
                System.out.println("новая игра");
                word = getNewWord();
                attempt = ATTEMPT;
                pointer = 0;
                namedLetters.clear();
            } else if(playerInput != null && playerInput.equalsIgnoreCase("выход из игры")) {
                keepPlaying = false;
            } else if(playerInput != null && playerInput.equalsIgnoreCase("подсказка")) {
                System.out.println(getClue(word, pointer));
            } else {System.out.println("некорректный ввод");}
            if (attempt==0 || pointer == word.length()) {
                keepPlaying = false;
            }
        }

        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(pointer+1 == word.length()) System.out.println("слово отгадано");
        System.out.println("игра окончена");
    }

    private static String getNewWord() {
        Random random = new Random();
        int wordIndex = random.nextInt(words.size());

        return words.get(wordIndex);
    }

    private static String getClue(String word, int pointer) {
        StringBuilder clueBuilder = new StringBuilder("еще не названы буквы в слове: ");
        ArrayList<Character> chars = new ArrayList<>();
        for(char c : word.substring(pointer).toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars);
        for (char c : chars) clueBuilder.append(c + " ");

        return clueBuilder.toString();
    }

    private static String stringInput(BufferedReader reader) {
        String str;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;
    }
}
