package lesson6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = DataList.getStudents();

        Student.printStudents(students, 2);
        Student.removeStudentsWithLowGrades();
    }
}