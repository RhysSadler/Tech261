package com.sparta.rs.static_example;

import java.util.ArrayList;

public class StaticBlock {
    private static ArrayList<String> names = new ArrayList<>();

    static {
        names.add("Mainish");
        names.add("Alex");
    }

    public static void main(String[] args) {
        System.out.println(names);
    }
}
