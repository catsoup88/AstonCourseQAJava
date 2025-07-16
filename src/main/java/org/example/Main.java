package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");

        dog.run(150);
        dog.swim(8);
        cat1.run(120);
        cat1.swim(5);
        cat2.run(250);

        System.out.println("\n----- Кормим котов -----");
        Cat[] cats = {cat1, cat2};
        Bowl bowl = new Bowl(15); //Изначально 15 еды в миске
        System.out.println("Всего еды в миске: " + bowl.getFood());

        for (Cat cat : cats) {
            cat.eat(bowl, 10); //Каждый хочет есть по 10 еды
        }

        System.out.println("\n----- Сытость котов -----");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isFull());
        }

        System.out.println("\n----- Повторная попытка кормления -----");
        bowl.addFood(10); //Пополним миску
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }

        System.out.println("\n----- Сытость котов -----");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isFull());
        }

        System.out.println("\n----- Информация -----");
        System.out.println("Животных создано: " + Animal.getAnimalsCount());
        System.out.println("Собак создано: " + Dog.getDogsCount());
        System.out.println("Котов создано: " + Cat.getCatsCount());
    }
}