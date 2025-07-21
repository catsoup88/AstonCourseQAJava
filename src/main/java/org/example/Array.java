package org.example;

public class Array {
    public static int Array(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива, массив должен быть размеров 4х4");
        }
        for (String[] abc : array) {
            if (abc.length != 4) {
                throw new MyArraySizeException("Неверный размер массива, массив должен быть размеров 4х4");
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: некорректное значение '" + array[i][j] + "'");
                }
            }
        }

        return sum;
    }
}
