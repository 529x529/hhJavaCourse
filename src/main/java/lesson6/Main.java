package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = DataList.getStudents();

        students.add(StudentBuilder.newStudent().setName("Федор").setGroup("B").setCourse(2).addGrade("Математика", 5).addGrade("Физика", 4).build());
        students.add(StudentBuilder.newStudent().setName("Максим").setGroup("B").setCourse(1).addGrade("Математика", 5).addGrade("Физика", 4).build());
        students.add(StudentBuilder.newStudent().setName("Антон").setGroup("B").setCourse(2).addGrade("Математика", 2).addGrade("Физика", 2).build());
        students.add(StudentBuilder.newStudent().setName("Михаил").setGroup("B").setCourse(1).addGrade("Математика", 5).addGrade("Физика", 4).build());
        students.add(StudentBuilder.newStudent().setName("Елена").setGroup("B").setCourse(1).addGrade("Математика", 5).addGrade("Физика", 4).build());
        students.add(StudentFactory.createStudent("Кирилл", "A", 1, "Rus"));
        students.add(StudentFactory.createStudent("Петр", "A", 1, "Eng"));

        Student.printStudents(students, 1);
        Student.removeStudentsWithLowGrades(students);
    }
}