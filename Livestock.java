package livestock;

public abstract class Livestock {
    private final String breed;
    private final int age;
    private final double weight;

    public Livestock(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public abstract void displayDetails();

    public double computeValue(double pricePerKg) {
        return pricePerKg * weight;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
