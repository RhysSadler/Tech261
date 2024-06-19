package com.sparta.rs;

public class App {
    public static void main(String[] args) {
        Animal max = new Dog("Fido", "terrier", 21);
        Animal barley = new Cat("Barley", "cat", 12);

        Animal[] animals = {max,barley};
        // anti pattern ((Cat) barley).climb();
        max.play();
        barley.play();


    }
}
