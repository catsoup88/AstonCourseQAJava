package org.example;
import java.util.ArrayList;
import java.util.Set;


public class StudentManagment {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        try {
            if (student.averageGrade() < 3) {
                students.remove(student);
            }
        } catch (IllegalStateException e) {
            System.out.println("Cannot delete student " + student.getName() + ": no grades available.");
        }
    }

    public void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
