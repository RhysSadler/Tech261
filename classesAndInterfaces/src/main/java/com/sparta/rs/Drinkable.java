package com.sparta.rs;

public interface Drinkable extends sleepable{

    int max = 10;
    void drink();

    default void print() {
        printFromInterface();
    }

    private static void printFromInterface() {
        System.out.println("I am print for an interface");
    }

    public static void doSomething(){
        System.out.println("Static method from an interface");
    }

}
