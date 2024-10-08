import cattle.Cattle;
import Goat.Goat;
import Chicken.Chicken;

public class LivestockManager {
    public static void main(String[] args) {
        Cattle cow = new Cattle("African Zebu", 7, 700, "Dairy");
        Goat goat = new Goat("Boer", 3, 120, true);
        Chicken chicken = new Chicken("Leghorn", 2, 4, 5);


        System.out.println("Cattle Details:");
        cow.displayDetails();
        System.out.println("Computed Price: Ugx" + cow.computeValue(8000));
        System.out.println();

        System.out.println("Goat Details:");
        goat.displayDetails();
        System.out.println("Computed Price: Ugx" + goat.computeValue(10000));
        System.out.println();

        System.out.println("Chicken Details:");
        chicken.displayDetails();
        System.out.println("Computed Price: Ugx" + chicken.computeValue(10000));
        System.out.println();
    }
}
