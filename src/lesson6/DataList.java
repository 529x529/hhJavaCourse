package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataList {
    private static List<Student> students = new ArrayList<>();

    static {
        Student student1 = new Student("Иван", "A", 2, Arrays.asList(2,3,2,3));
        Student student2 = new Student("Петр", "B", 3, Arrays.asList(2,3,5,3));
        Student student3 = new Student("Анна", "A", 2, Arrays.asList(2,2,2,5));
        Student student4 = new Student("Иван", "B", 4, Arrays.asList(5,5,5,4));
        Student student5 = new Student("Елена", "A", 3, Arrays.asList(3,5,5,4));
        Student student6 = new Student("Антон", "A", 2, Arrays.asList(2,2,2,3));
        Student student7 = new Student("Александр", "A", 2, Arrays.asList(3,3,3,5));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
    }
    public static List<Student> getStudents(){
        return students;
    }
}
