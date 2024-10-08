package cattle;

import livestock.Livestock;

public class Cattle extends Livestock {
    private final String purpose;


    public Cattle(String breed, int age, double weight, String purpose) {
        super(breed, age, weight);
        this.purpose = purpose;
    }


    @Override
    public void displayDetails() {
        System.out.println("Cattle Breed: " + getBreed());
        System.out.println("Age: " + getAge() + " years");
        System.out.println("Weight: " + getWeight() + " kg");
        System.out.println("Purpose: " + purpose);
    }
}
