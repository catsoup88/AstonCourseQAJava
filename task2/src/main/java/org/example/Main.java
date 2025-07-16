package org.example;


public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7, "Розовый", "Фиолетовый");
        Shape rectangle = new Rectangle(5, 8, "Зеленый", "Жёлтый");
        Shape triangle = new Triangle(5, 3, 9, "Красный", "Синий");

        circle.printInfo();
        System.out.println();
        rectangle.printInfo();
        System.out.println();
        triangle.printInfo();
    }
}