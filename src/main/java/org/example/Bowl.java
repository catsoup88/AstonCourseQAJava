package org.example;

public class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0); // Защита от отрицательных значений (еда в миске не может быть меньше нуля)
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды. Всего: " + food);
        }
    }

    public int getFood() {
        return food;
    }
}
