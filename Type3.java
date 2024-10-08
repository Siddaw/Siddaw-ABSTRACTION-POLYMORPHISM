public class Type3 implements ObjectBehavior {

    @Override
    public void performAction() {
        System.out.println("Performing action for Type3");
    }

    @Override
    public void haltAction() {
        System.out.println("Halting action for Type3");
    }

    @Override
    public int getAttribute() {
        return 300;
    }

    @Override
    public String getType() {
        return "Type3";
    }

    public String getDetail3() {
        return "Detail3 for Type3";
    }
}