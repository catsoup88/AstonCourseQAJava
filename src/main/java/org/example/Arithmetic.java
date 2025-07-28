package org.example;

public class Arithmetic {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Недопустимо деление на ноль");
        return (double) a / b;
    }
}
