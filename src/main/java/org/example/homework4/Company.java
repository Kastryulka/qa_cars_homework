package org.example.homework4;

import java.util.Arrays;
import java.util.HashMap;

///Создайте класс Company с полями name и массивом employees.
///Добавьте в Company метод addEmployee(Employee emp), а также метод calculateTotalSalary().
///В main создайте компанию, добавьте нескольких сотрудников и рассчитайте общий фонд зарплат.
public class Company {
    private String name;
    private Employee[] employees;
    private final String[] positions;
    private final HashMap<String, Integer> salaryAndPositions;

    public Company (String name, String[] positions, HashMap<String, Integer> salaryAndPositions) {
        this.name = name;
        this.positions = positions;
        employees = new Employee[0];
        this.salaryAndPositions = new HashMap<>();
        this.salaryAndPositions.putAll(salaryAndPositions);
    }

    public void addEmployee(Employee emp) {
        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = emp;
    }
    public int calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee i : employees) {
            totalSalary = totalSalary + i.getSalary();
        }
        return totalSalary;
    }

    /// возвращает ставку по названию должности
    public int getSalaryByPosition (String position) {
        if (salaryAndPositions.containsKey(position)) {
            return salaryAndPositions.get(position);
        }
        else {
            System.out.println("неизвестная должность");
            return 0;}
    }
    public String getName() {return name;}
    public Employee[] getEmployees() {return employees;}
    public String[] getPositions() {return positions;}
    public HashMap<String, Integer> getSalaryAndPositions() {return salaryAndPositions;}
}
