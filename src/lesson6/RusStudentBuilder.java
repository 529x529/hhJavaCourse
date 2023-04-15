package lesson6;

public class RusStudentBuilder extends StudentBuilder {
    private String lang;
    public StudentBuilder withLang() {
        this.lang = lang;
        return this;
    }
}
