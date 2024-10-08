public class Type2 implements ObjectBehavior {

    @Override
    public void performAction() {
        System.out.println("Performing action for Type2");
    }

    @Override
    public void haltAction() {
        System.out.println("Halting action for Type2");
    }

    @Override
    public int getAttribute() {
        return 200;
    }

    @Override
    public String getType() {
        return "Type2";
    }

    public String getDetail2() {
        return "Detail2 for Type2";
    }
}