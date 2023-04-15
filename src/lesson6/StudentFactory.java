package lesson6;
public class StudentFactory {
    public static Student createStudent(String name, String group, int course, String lang) {
        switch (lang) {
            case "Rus":
                return new RusStudentBuilder()
                        .withLang()
                        .setName(name)
                        .setGroup(group)
                        .setCourse(course)
                        .build();
            case "Eng":
                return new EngStudentBuilder()
                        .withLang()
                        .setName(name)
                        .setGroup(group)
                        .setCourse(course)
                        .build();
            default:
                throw new RuntimeException("Unexpected lang " + lang);
        }
    }
}
