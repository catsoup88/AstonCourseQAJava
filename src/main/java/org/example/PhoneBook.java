package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    // Хранение телефонного справочника. Ключ - фамилия, значение - список номеров телефонов
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи в справочник
    public void add(String lastName, String phoneNumber) {
        // Если фамилия уже есть в справочнике, добавляем новый номер в список
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber);
    }

    // Метод для поиска телефонов по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    // Метод для вывода всех записей справочника (по желанию)
    public void printAll() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Телефоны: " + entry.getValue());
        }
    }
}
