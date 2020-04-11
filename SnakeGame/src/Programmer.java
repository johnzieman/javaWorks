import interfaces.Progging;

public class Programmer extends Employee implements Progging {
    public Programmer(String name) {
        super(name);
    }
    @Override
    public void proger(){
        System.out.println("Progging");
    }
}
