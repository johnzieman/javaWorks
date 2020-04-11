import interfaces.Cooking;

public class Chief extends Employee implements Cooking {
    public Chief(String name) {
        super(name);
    }

    @Override
    public void cookie() {
        System.out.println("Cooking");
    }
}
