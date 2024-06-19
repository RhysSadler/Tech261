package com.sparta.rs;
//State and behaviour
public abstract class Animal implements Drinkable{
    private String name;
    private String breed;
    private int age;

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void play() {
        System.out.println(name + " want to play");
    }
    public abstract void eat();
        //System.out.println("animal is eating"); //everyone is overriding

}
