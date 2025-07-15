package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //2
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 16 Pro", "15.09.2024", "Apple Inc.", "USA", 1299.00, false);
        productsArray[2] = new Product("Samsung Galaxy Tab S10 FE", "03.10.2024 ", "Samsung", "Вьетнам", 1555.99, true);
        productsArray[3] = new Product("Google Pixel 6 Pro", "28.10.2021", "Google Inc.", "USA", 339.99, false);
        productsArray[4] = new Product("iPhone 15 Pro", "12.09.2023", "Apple Inc.", "USA", 899.00, true);
        for (Product product : productsArray) {
            product.info();
        }

        //3
        Park parkOne = new Park("Гомельский парк");
        Park.Attraction attractionOne = new Park("dfdfg").Attraction();
        Park.Attraction attraction1 = new Attraction("Колесо обозрения", "10.00 - 22.00", 15.00);
        Park.Attraction attraction2 = park.new Attraction("Лебеди", "10.00 - 20.00", 10.00);
        Park.Attraction attraction3 = park.new Attraction("Американские горки", "10.00 - 23.00", 25.00); */
        parkOne.addAttraction(attractionOne);
        parkOne.printParkinfo();
        attraction1.infoPark();
        attraction2.infoPark();
        attraction3.infoPark();
    }
}