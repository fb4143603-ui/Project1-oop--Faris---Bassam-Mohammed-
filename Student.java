import java.util.ArrayList;

public abstract class Student {
    private String id;
    private String name;
    private ArrayList<Double> marks;

    public Student(String id, String name, ArrayList<Double> marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }

    public abstract boolean isPassed();

    public abstract void displayInfo();
}
