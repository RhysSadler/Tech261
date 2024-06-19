package com.sparta.rs.static_example;

public class App {
    public static void main(String[] args) {
        Spartan manish = new Spartan();
        Spartan alex = new Spartan();

        manish.setName("manish");
        alex.setName("Alex");

        System.out.println(manish.getName());
        System.out.println(alex.getName());

        Spartan.printSpartan(manish);
        Spartan.printSpartan(alex);
        System.out.println(manish.equals(alex));
    }
}
