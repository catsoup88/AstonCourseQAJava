package org.example;


public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String attractionName;
        private String workingHours;
        private double Price;

        public Attraction(String attractionName, String workingHours, double Price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.Price = Price;
        }
        public void infoPark() {
            System.out.println("Название:" + attractionName);
            System.out.println("Время работы:" + workingHours);
            System.out.println("Цена:" + Price + " руб.");
            System.out.println(" ");
        }
    }
}
