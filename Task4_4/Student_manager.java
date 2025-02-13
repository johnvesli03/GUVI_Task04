package Task4_4;
import java.util.HashMap;
import java.util.Map;


public class Student_manager {
    private Map<String, Double> studentGrades;

    public Student_manager() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, double grade) {
        studentGrades.put(name, grade);
        System.out.println(name + " added with grade: " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentGrades.get(name));
        } else {
            System.out.println(name + " not found.");
        }
    }
}

