package lesson6;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        double gradeSum = 0.0;
        for (int grade : grades) {
            gradeSum += grade;
        }
        return gradeSum / grades.size();
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Имена студентов, которые обучаются на " + course + " курсе:");
        students.stream()
                .filter(student -> student.getCourse() == course)
                .forEach(student -> System.out.println(student.getName()));
    }

    public static void removeStudentsWithLowGrades() {
        Iterator<Student> it = DataList.getStudents().iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getAverageGrade() < 3.0) {
                it.remove();
                System.out.println("Студент: " + student.getName() + " отчислен. Средний балл: " + student.getAverageGrade());
            } else if (student.getAverageGrade() >= 3){
                System.out.println("Студент: " + student.getName() + " переведен на следующий курс. Средний балл: " + student.getAverageGrade());
                int newCourse = student.getCourse() + 1;
                student.course = newCourse;
            }
        }
    }
}


