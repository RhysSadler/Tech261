package com.sparta.rs;

public class DangerousAnimals {
    private String name;
    private String habitat;
    private int dangerLevel;

    public void DangerousAnimal(String name, String habitat, int dangerLevel) {
        this.name = name;
        this.habitat = habitat;
        this.dangerLevel = dangerLevel;
    }

    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void displayInfo() {
        System.out.println("Animal: " + name);
        System.out.println("Habitat: " + habitat);
        System.out.println("Danger Level: " + dangerLevel);
    }

}




