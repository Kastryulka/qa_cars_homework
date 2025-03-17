package org.example.homework4;

import java.util.HashMap;

public class Homework4 {
    public static void testHW4_1() {
        Student student = new Student();
        student.setName("Николай");
        student.setGrades(new int[] {3 , 2, 3, 4, 5});
        student.printInfo();
    }

    public static void testHW4_2() {
        System.out.println("library1");
        Library library1 = new Library();
        library1.displayBooks();
        library1.addBook("Книга1");
        library1.addBook("Книга2");
        library1.addBook("Книга3");
        library1.removeBook("Книга2");

        library1.removeBook("Книга1");
        library1.addBook("Книга1");
        library1.addBook("Книга2");

        library1.removeBook("Книга1");
        library1.removeBook("Книга9");
        library1.removeBook("Книга3");
        library1.removeBook("Книга2");
        library1.addBook("Книга1");

        System.out.println("\nlibrary2");
        Library library2 = new Library(new String[]{});
        library2.displayBooks();
        library2.addBook("Книга1");
        library2.addBook("Книга2");
        library2.addBook("Книга3");

        System.out.println("\nlibrary3");
        Library library3 = new Library(null);
        library3.displayBooks();
        library3.addBook("Книга1");
        library3.addBook("Книга2");
        library3.addBook("Книга3");
        library3.addBook(null);
    }

    public static void testHW4_3() {
        Student[] students = new Student[] {
                new Student("Олег", new int[]{2, 3, 3}),
                new Student("", new int[]{}),
                new Student(null, null)};
        students[0].printInfo();
        System.out.println("средний балл студента " + students[0].getName() + ": " + String.format("%.1f", students[0].calculateAverage()));
        students[1].printInfo();
        students[1].setGrades(new int[] {2, 3, 4, 5});
        students[1].setName("Виталий");
        students[1].printInfo();
        System.out.println("средний балл студента " + students[1].getName() + ": " + String.format("%.1f", students[1].calculateAverage()));
        students[2].printInfo();
        students[2].setGrades(new int[] {2, 3, 5, 5, 2});
        students[1].setName("Кирилл");
        students[2].printInfo();
        System.out.println("средний балл студента " + students[2].getName() + ": " + String.format("%.1f", students[2].calculateAverage()));

        int bestStudentIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].calculateAverage() > students[bestStudentIndex].calculateAverage()) {
                bestStudentIndex = i;
            }
        }

        System.out.println("лучший студент по средним оценкам: " + students[bestStudentIndex].getName());
    }

    public static void testHW4_4() {
        int depositTestData[] = new int[] {-100, 0, 100, 200, 300, 100, 50, 10};
        int withdrawTestData[] = new int[] {5000, -100, 0, 100, 200, 300, 100, 50, 10};
        BankAccount bankAccountOleg = new BankAccount("Олег");
        BankAccount bankAccountKirill = new BankAccount("Кирилл",760,
                new String[] {"balance + 200", "balance + 300", "balance + 100", "balance + 50", "balance + 10"});

        for (int i : depositTestData) {
            bankAccountOleg.deposit(i);
            bankAccountOleg.printBalance();
            bankAccountOleg.printTransactions();
        }
        System.out.println("-------------------------");
        bankAccountOleg.printTransactions();

        for (int i : withdrawTestData) {
            bankAccountKirill.withdraw(i);
            bankAccountKirill.printBalance();
            bankAccountKirill.printTransactions();
        }
        System.out.println("-------------------------");
        bankAccountKirill.printTransactions();
    }

    public static void testHW4_5() {
        final String[] positions = new String[] {"работник", "бухгалтер", "секретарь", "руководитель"};
        final HashMap<String, Integer> salaryAndPositions = new HashMap<>();
        salaryAndPositions.put(positions[0], 50);
        salaryAndPositions.put(positions[1], 100);
        salaryAndPositions.put(positions[2], 150);
        salaryAndPositions.put(positions[3], 500);

        Company company = new Company("контора молодцов", positions, salaryAndPositions);

        company.addEmployee(new Employee("Олег Кириллович Работников", positions[0], company.getSalaryByPosition(positions[0])));
        System.out.println("добавлен работник, зарплата = " + company.getSalaryByPosition(positions[0]));
        company.addEmployee(new Employee("Наталья Петровна Бухгалтерова", positions[1], company.getSalaryByPosition(positions[1])));
        System.out.println("добавлен работник, зарплата = " + company.getSalaryByPosition(positions[1]));
        company.addEmployee(new Employee("Леночка", positions[2], company.getSalaryByPosition(positions[2])));
        System.out.println("добавлен работник, зарплата = " + company.getSalaryByPosition(positions[2]));
        company.addEmployee(new Employee("Иван Васильевич Буржуинов", positions[3], company.getSalaryByPosition(positions[3])));
        System.out.println("добавлен работник, зарплата = " + company.getSalaryByPosition(positions[3]));

        System.out.println("общий зарплатный фонд в компании \"" + company.getName() + "\"" + ": " + company.calculateTotalSalary());
    }
}
