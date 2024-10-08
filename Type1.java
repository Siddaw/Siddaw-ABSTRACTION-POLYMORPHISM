public class Type1 implements ObjectBehavior {
    private int attribute = 100;
    private String detail1 = "Detail1 for Type1";

    @Override
    public void performAction() {
        System.out.println("Performing action for Type1");
    }

    @Override
    public void haltAction() {
        System.out.println("Halting action for Type1");
    }

    @Override
    public int getAttribute() {
        return attribute;
    }

    @Override
    public String getType() {
        return "Type1";
    }

    public String getDetail1() {
        return detail1;
    }
}
