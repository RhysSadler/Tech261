package com.sparta.rs;

public class Dog extends Animal{

    public Dog(String name, String breed, int age) {
        super(name, breed, age);
    }
    // overload - name has to be that same
    //1. return type
    //2. type of parameters
    //3 order of the parameters

    public void play(String name) {
        System.out.println(super.getName() + " wants to play with " + name);
    }
}
