package org.example;


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Мухтар");
        Cat cat1 = new Cat("Борис");
        Cat cat2 = new Cat("Шрек");

        dog.run(160);
        dog.swim(10);
        cat1.run(100);
        cat1.swim(7);
        cat2.run(300);

        System.out.println("\n -Кормим котов- ");
        Cat[] cats = {cat1, cat2};
        Bowl bowl = new Bowl(12);
        System.out.println("Всего еды в миске: " + bowl.getFood());

        for (Cat cat : cats) {
            cat.eat(bowl, 5);
        }

        System.out.println("\n -Сытость котов- ");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isFull());
        }

        System.out.println("\n -Повторная попытка кормления- ");
        bowl.addFood(15);
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 15);
            }
        }

        System.out.println("\n -Сытость котов- ");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isFull());
        }

        System.out.println("\n -Информация- ");
        System.out.println("Животных создано: " + Animal.getAnimalsCount());
        System.out.println("Собак создано: " + Dog.getDogsCount());
        System.out.println("Котов создано: " + Cat.getCatsCount());
    }
}