package com.sparta.rs;

public class StringExample {
    public static void main(String[] args) {
        String string1 = "Hello";
        string1 = string1.toUpperCase();
        System.out.println(string1);

        string1.toCharArray();
        System.out.println(string1);

        String string = String.valueOf(1000);
        System.out.println(string);

        String name = "Manish";
        System.out.println("Hello " + name);


    }
}
