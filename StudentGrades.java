import java.util.LinkedHashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> studentGrades = new LinkedHashMap<>();
        
        studentGrades.put(101, "A");
        studentGrades.put(102, "B");
        studentGrades.put(103, "A+");
        studentGrades.put(104, "C");
        studentGrades.put(105, "B+");
        
        System.out.println("Student Grades: ");
        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
