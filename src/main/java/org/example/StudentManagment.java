package org.example;
import java.util.Iterator;
import java.util.Set;


public class StudentManagment {
    public static void removeStudentsWithLowGrades(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() < 3) {
                iterator.remove();
            }
        }
    }

    // Метод для перевода студентов на следующий курс, если средний балл >= 3
    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.promoteToNextCourse();
            }
        }
    }

    // Метод для вывода студентов на определённом курсе
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Students on course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
