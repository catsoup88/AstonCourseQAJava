package org.example;


import java.util.HashSet;
import java.util.Set;

import static org.example.StudentManagment.*;


public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        // Добавление студентов в коллекцию
        students.add(new Student("Alice", "A1", 1, new double[]{3.5, 4.0, 5.0}));
        students.add(new Student("Bob", "B2", 2, new double[]{2.5, 2.8, 3.0}));
        students.add(new Student("Charlie", "C3", 3, new double[]{4.5, 4.7, 5.0}));
        students.add(new Student("David", "D4", 4, new double[]{2.0, 2.2, 2.5}));

        // Печать студентов на 2 курсе до изменений
        printStudents(students, 2);

        // Удаление студентов с низким баллом
        removeStudentsWithLowGrades(students);

        // Перевод студентов на следующий курс
        promoteStudents(students);

        // Печать студентов на 2 курсе после изменений
        printStudents(students, 2);

        // Печать всех студентов после изменений
        System.out.println("\nAll students after changes:");
        for (Student student : students) {
            System.out.println(student);
        }
        PhoneBook phoneBook = new PhoneBook();

        // Добавление записей в справочник
        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Иванов", "234-56-78");
        phoneBook.add("Петров", "345-67-89");
        phoneBook.add("Смирнов", "456-78-90");

        // Поиск телефонов по фамилии
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Смирнов"));
        System.out.println("Телефоны, которых нет в справочнике: " + phoneBook.get("Кузнецов"));

        // Вывод всех записей
        phoneBook.printAll();
    }
}