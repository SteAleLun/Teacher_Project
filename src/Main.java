
public class Main {
    public static void main(String[] args) {
        Teacher walter = new Teacher("Walter White" , "Сhemistry");
        Student jesse = new Student("Jesse Pinkman");

        System.out.println(walter.evaluate(jesse));
    }
}
