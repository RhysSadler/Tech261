package com.sparta.rs;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        //int age = 5
        Dog max = new Dog("Max", "Terrier", 12);
        Dog fido = new Dog("fido", "German Shepard", 2);
        System.out.println(max.getAge());
    }
}
