package org.example.homework4;

//Создайте класс Employee, содержащий name, position, salary.
public class Employee {
    private String name;
    private String position;
    private int salary;

    Employee (String name, String position, int salary) {
        setName(name);
        setPosition(position);
        setSalary(salary);
    }

    public void setName (String name) {this.name = name;}
    public void setPosition (String position) {this.position = position;}
    public void setSalary (int salary) {this.salary = salary;}
    public String getName () {return this.name;}
    public String getPosition () {return this.position;}
    public int getSalary () {return this.salary;}
}
