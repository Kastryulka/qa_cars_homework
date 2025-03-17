package org.example.homework4;


import java.util.Arrays;
import java.util.Objects;

///ДЗ1
/// Создайте класс Student с полями name, grades[] (массив оценок) и методом printInfo(), который выводит имя и все оценки.
///В main создайте объект, заполните массив оценок и вызовите метод
/// ДЗ3
/// Добавьте в класс Student конструктор.
/// Реализуйте метод calculateAverage(), который вычисляет средний балл студента.
/// В main создайте массив students[] из 3 студентов и найдите лучшего по среднему баллу.
public class Student {
    private String name = "John Doe";
    private int[] grades;

    /**
     * @param name имя студента, если строка пустая, значение по-умолчанию - "John Doe"
     * @param grades массив оценок, если передан пустой, создается массив нулевой длины
     */
    public Student(String name, int[]grades) {
        setName(name);
        setGrades(grades);
    }
    public Student() {}

    /// выводит в консоль оценки студента в формате: "оценки студента name: список оценок через запятую"
    public void printInfo() {
        System.out.println("оценки студента " + this.name +":");
        if (this.grades.length > 0) {
            for (int i = 0; i < this.grades.length-1; i ++) {
                System.out.print(grades[i] + ", ");
            }
            System.out.print(grades[this.grades.length-1]);
        }
        else {
            System.out.println("оценки отсутствуют");
        }
        System.out.println();
    }

    /// рассчитывает средний балл студента
    public double calculateAverage() {
        double summ = 0;
        for (int i : grades) {
            summ = summ + i;
        }
        if (summ != 0) {
            return summ / grades.length;
        }
        else {
            System.out.println("сумма оценок студента = 0");
            return 0.0;
        }

    }

    public void setName(String name) {
        if (!Objects.isNull(name) && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getName() {
        return this.name;
    }
    public void setGrades(int[] grades) {
        if (!Objects.isNull(grades) && grades.length > 0) {
            this.grades = Arrays.copyOf(grades, grades.length);
        }
        else {
            System.out.println("указано некорректное значение, оценки не сохранены");
            this.grades = new int[0];
        }
    }
    public int[] getGrades() {
        return this.grades;
    }
}
