package Polymorism;

public class Poly {
    public static void main(String[] args) {


    }
    public abstract class Animal {
        public abstract void makeSound();
    }
    public class Lion extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Roar!");
        }
    }

    public class Shark extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Splash!");
        }
    }

    public class Eagle extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Screech!");
        }
    }
}
