package com.sparta.rs;

public class App {
    public static void main(String[] args) {
        Dog max = new Dog("Fido", "terrier", 21);
        Cat barley = new Cat("Barley", "cat", 12);

        max.play();
        barley.play();
        max.play(barley.getName());

    }
}
