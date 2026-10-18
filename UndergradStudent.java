import java.util.ArrayList;

public class UndergradStudent extends Student {

    public UndergradStudent(String id, String name, ArrayList<Double> marks) {
        super(id, name, marks);
    }

    @Override
    public boolean isPassed() {
        return calculateAverage() >= 60.0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate Student Details:");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Marks: " + getMarks());
        System.out.printf("Average: %.2f\n", calculateAverage());
        System.out.println("Status: " + (isPassed() ? "Passed" : "Failed"));
        System.out.println("----------------------------------------");
    }
}
