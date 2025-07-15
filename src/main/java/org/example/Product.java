package org.example;

public class Product {
    private String name, data, manufacture, country;
    private double price;
    private boolean reserved;
    public Product (String name, String data, String manufacture, String country, double price, boolean reserved) {
        this.name = name;
        this.data = data;
        this.manufacture = manufacture;
        this.country = country;
        this.price = price;
        this.reserved = reserved;
    }
    public void info() {
        System.out.println("Product " + name);
        System.out.println("Data " + data);
        System.out.println("Manafacture " + manufacture);
        System.out.println("Country " + country);
        System.out.println("Price " + price);
        System.out.println("Reserved " + reserved);
        System.out.println("-------------------------");
    }
}