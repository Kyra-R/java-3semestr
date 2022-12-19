package work19;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("No name for the student");
    }
}
