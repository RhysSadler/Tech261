package com.sparta.rs;

public class Cat extends Animal{

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public void play() {
        System.out.println(super.getName() + " does not want to play");
    }

    @Override
    public void eat() {
        System.out.println("Can is eating");
    }

    public void climb(){
        System.out.println("cat is climbing");
    }

    @Override
    public void drink() {
        Drinkable.doSomething();

    }

    @Override
    public String goToSleep() {
        return "";
    }
}
