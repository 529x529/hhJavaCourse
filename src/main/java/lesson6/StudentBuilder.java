package lesson6;

import java.util.HashMap;
import java.util.Map;

public class StudentBuilder {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> grades = new HashMap<>();

    public static StudentBuilder newStudent() {
        return new StudentBuilder();
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setGroup(String group) {
        this.group = group;
        return this;
    }

    public StudentBuilder setCourse(int course) {
        this.course = course;
        return this;
    }

    public StudentBuilder addGrade(String subject, int grade) {
        grades.put(subject, grade);
        return this;
    }

    public Student build() {
        return new Student(name, group, course, grades);
    }
}
