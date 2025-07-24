package org.example;

import java.util.HashSet;
import java.util.TreeMap;

public class PhoneBook {
    private TreeMap<String, HashSet<Integer>> phoneBook = new TreeMap<>();
    private HashSet<Integer> Phones = new HashSet<>();


    public void add(String surname, Integer phoneNumber) {
        if (Phones.contains(phoneNumber)) {
            System.out.println("Этот номер телефона уже существует");
            return;
        }
        Phones.add(phoneNumber);

        HashSet<Integer> phones = phoneBook.get(surname);
        if (phones == null) {
            phones = new HashSet<>();
            phoneBook.put(surname, phones);
        }
        phones.add(phoneNumber);
    }

    public void get(String surname) {
        HashSet<Integer> phones = phoneBook.get(surname);
        if (phones != null) {
            System.out.println(surname + phones);
        }
    }
}
