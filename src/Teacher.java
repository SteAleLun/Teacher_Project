import java.util.Random;

public class Teacher {

    private String name;

    private String theme;

    private String[] grades = {
            "неудовлетворительно",
            "удовлетворительно",
            "хорошо",
            "отлично",
    };


    public Teacher(String name, String theme) {
        this.name = name;
        this.theme = theme;
    }


    public String evaluate(Student student){
        return "Преподаватель " + name
                + " оценил студента с именем " + student.getName()
                + " по предмету " + theme
                + " на оценку " + grades[new Random().nextInt(4)];
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
