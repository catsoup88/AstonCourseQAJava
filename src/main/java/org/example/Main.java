package org.example;


import java.util.HashMap;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {

        // Задание 1
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Russian", 5);
        grades.put("English", 5);
        grades.put("Geometry", 5);

        Student student = new Student("Aleksandr Doroschenko", "B", 2, grades);

        StudentManagment manager = new StudentManagment();
        manager.addStudent(student);
        student.upCourse();
        manager.printStudents(new HashSet<>(manager.getStudents()), 3);

        //Задание 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("manykin", 12354836);
        phoneBook.add("denisov", 87695679);
        phoneBook.get("denisov");
    }
}