package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Coffee latte = new Coffee(true, false, 78, 10);
        Coffee filterCoffee = new Coffee(false, false, 5, 82);

        if (latte.equals(filterCoffee)) {
            System.out.println("Напитки одинаковы");
        } else {
            System.out.printf("Все правильно!");
        }
    }

    public static String print(Coffee coffee) {
        return coffee.getName();
    }
}