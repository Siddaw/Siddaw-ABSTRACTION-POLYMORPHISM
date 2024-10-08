package Chicken;

import livestock.Livestock;

public class Chicken extends Livestock {
    private final int eggsPerWeek;

    public Chicken(String breed, int age, double weight, int eggsPerWeek) {
        super(breed, age, weight); // Call superclass constructor
        this.eggsPerWeek = eggsPerWeek;
    }

    @Override
    public void displayDetails() {
        System.out.println("Chicken Breed: " + getBreed());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Eggs per week: " + eggsPerWeek);
    }
}
