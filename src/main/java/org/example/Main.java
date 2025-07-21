package org.example;


public class Main {
    public static void main(String[] args) {
        String [][] correctArray = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "15", "16" },
        };

        String [][] sizeArray = {
                {"1", "2", "3", },
                {"5", "6", "7", },
                {"9", "10", "11", },
        };

        String [][] dataArray = {
                {"1", "2", "3", "v" },
                {"5", "g", "7", "8" },
                {"9", "10", "11", "u" },
                {"13", "14", "h", "16" },
        };

        try {
            int result = Array.Array(correctArray);
            System.out.println("Сумма всех элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }

        try {
            int result = Array.Array(sizeArray);
            System.out.println("Сумма всех элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }

        try {
            int result = Array.Array(dataArray);
            System.out.println("Сумма всех элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }

        int[] numbers = {1, 2, 3, 4, 5, 6,};
        try {

            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива: " + e.getMessage());
        }
}
}