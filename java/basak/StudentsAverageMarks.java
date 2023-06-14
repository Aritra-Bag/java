import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    double marks;

    Student(double marks) {
        this.marks = marks;
    }

    double getMarks() {
        return marks;
    }
}

public class StudentsAverageMarks {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of students: ");
        int numStudents = Integer.parseInt(reader.readLine());

        Student[] students = new Student[numStudents];
        double totalMarks = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            double marks = Double.parseDouble(reader.readLine());
            students[i] = new Student(marks);
            totalMarks += marks;
        }

        double averageMarks = totalMarks / numStudents;
        System.out.println("Average marks obtained by all students: " + averageMarks);
    }
}
