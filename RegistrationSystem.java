import java.util.ArrayList;

public class RegistrationSystem implements ManagementSystem {
    private ArrayList<Student> studentList;

    public RegistrationSystem() {
        studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully!");
    }

    @Override
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students registered yet.");
            return;
        }
        System.out.println("\n========== Registered Students ==========");
        for (Student student : studentList) {
            student.displayInfo();
        }
    }

    @Override
    public Student findStudentById(String id) {
        for (Student student : studentList) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }
}
