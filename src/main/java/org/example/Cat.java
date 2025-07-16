package org.example;

public class Cat extends Animal {
    private static int catsCount = 0;
    private final int maxRun = 200;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCatsCount() {
        return catsCount;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isFull = true;
            System.out.println(name + " поел");
        } else {
            System.out.println(name + " не поел. Недостаточно еды");
        }
    }
}
