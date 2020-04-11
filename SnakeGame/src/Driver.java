import interfaces.Driving;

public class Driver extends Employee implements Driving {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void driving() {
        System.out.println("Driving");
    }
}
