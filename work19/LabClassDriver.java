package work19;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        LabClassUI UI = new LabClassUI(labClass);
        try {
            UI.run();
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
