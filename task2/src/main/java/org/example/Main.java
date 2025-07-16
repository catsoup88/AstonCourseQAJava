package org.example;


public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Синий", "Зелёный");
        Shape rectangle = new Rectangle(4, 6, "Фиолетовый", "Жёлтый");
        Shape triangle = new Triangle(3, 4, 5, "Оранжевый", "Коричневый");

        circle.printInfo();
        System.out.println();
        rectangle.printInfo();
        System.out.println();
        triangle.printInfo();
    }
}