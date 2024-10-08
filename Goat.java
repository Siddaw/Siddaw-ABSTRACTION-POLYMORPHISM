package Goat;

import livestock.Livestock;

public class Goat extends Livestock {
    private final boolean isMilking;


    public Goat(String breed, int age, double weight, boolean isMilking) {
        super(breed, age, weight);
        this.isMilking = isMilking;
    }
    @Override
    public void displayDetails() {
        System.out.println("Goat Breed: " + getBreed());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Milking: " + (isMilking ? "Yes" : "No"));
    }
}
