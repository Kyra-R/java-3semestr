package work19;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException() {
        super("Такого студента нет");
    }
}
