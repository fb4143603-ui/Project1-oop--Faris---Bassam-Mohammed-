import java.util.ArrayList;

public class GradStudent extends Student {

    public GradStudent(String id, String name, ArrayList<Double> marks) {
        super(id, name, marks);
    }

    @Override
    public boolean isPassed() {
        return calculateAverage() >= 75.0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Graduate Student Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.ou
t.println("----------------------------------------");
    }
}
