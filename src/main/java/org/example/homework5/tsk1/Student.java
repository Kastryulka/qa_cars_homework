package org.example.homework5.tsk1;


import java.util.ArrayList;
import java.util.Objects;

/** 1. Легкое: Учет студентов
Задача:
Создайте класс Student с полями:
name (имя)
age (возраст)
grades (ArrayList<Integer> — список оценок).
Реализуйте методы:
addGrade(int grade) — добавляет оценку в список.
getAverageGrade() — возвращает средний балл.
В main создайте ArrayList<Student>, добавьте 3-х студентов, выведите их средние оценки.*/
public class Student {
    private String name = "John Doe";
    private int age = -1;
    private ArrayList<Integer> grades = new ArrayList<>();

    /**
     * @param name имя студента, если строка пустая, значение по умолчанию - "John Doe"
     * @param age возраст студента, значение по умолчанию = -1
     * @param grades список оценок, если передан пустой
     */
    public Student(String name, int age,  ArrayList<Integer> grades) {
        setAge(age);
        setName(name);
        setGrades(grades);
    }
    public Student() {}

    /// добавляет оценку в список
    public void addGrade(int grade) {
        if (!Objects.isNull(grade) && (grade > 0 && grade < 100)) {
            grades.add(grade);
        } else {
            System.out.println("некорректная оценка, оценка не была добавлена");
        }
    }

    /// возвращает средний балл
    public double getAverageGrade() {
        int summ = 0;
        for (Integer grade : grades) {
            summ += grade;
        }
        return (double)summ/grades.size();
    }

    public void setName(String name) {
        if (!Objects.isNull(name) && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}
    public void setGrades(ArrayList<Integer> grades) {
        if (!Objects.isNull(grades) && !grades.isEmpty()) {
            this.grades.addAll(grades);
        }
        else {
            System.out.println("указано некорректное значение, оценки не сохранены");
        }
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
}
