import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ObjectBehavior> objects = new ArrayList<>();
        objects.add(new Type1());
        objects.add(new Type2());
        objects.add(new Type3());

        for (ObjectBehavior obj : objects) {
            obj.performAction();
            System.out.println("Attribute: " + obj.getAttribute());
            System.out.println("Type: " + obj.getType());
            obj.haltAction();

            if (obj instanceof Type1) {
                System.out.println("Detail1: " + ((Type1) obj).getDetail1());
            } else if (obj instanceof Type2) {
                System.out.println("Detail2: " + ((Type2) obj).getDetail2());
            } else if (obj instanceof Type3) {
                System.out.println("Detail3: " + ((Type3) obj).getDetail3());
            }
        }
    }
}