package lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DataList {
    private static List<Student> students = new ArrayList<>();

    static {
        Student student1 = new Student("Иван", "A", 2, Map.of("Математика", 3, "Физика", 4, "История", 5, "Информатика", 2));
        Student student2 = new Student("Петр", "B", 3, Map.of("Математика", 2, "Физика", 2, "История", 3, "Информатика", 3));
        Student student3 = new Student("Анна", "A", 2, Map.of("Математика", 3, "Физика", 3, "История", 2, "Информатика", 2));
        Student student4 = new Student("Иван", "B", 4, Map.of("Математика", 3, "Физика", 4, "История", 2, "Информатика", 3));
        Student student5 = new Student("Елена", "A", 3, Map.of("Математика", 2, "Физика", 2, "История", 2, "Информатика", 3));
        Student student6 = new Student("Антон", "A", 2, Map.of("Математика", 3, "Физика", 4, "История", 5, "Информатика", 5));
        Student student7 = new Student("Александр", "A", 2, Map.of("Математика", 3, "Физика", 4, "История", 5, "Информатика", 4));

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
