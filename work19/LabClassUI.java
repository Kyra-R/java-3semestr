package work19;
import java.util.Scanner;

public class LabClassUI {
    private Scanner scanner;
    private LabClass labClass;


    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
        scanner = new Scanner(System.in);
    }

    private void addStudent() throws EmptyStringException {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите оценку: ");
        double mark = scanner.nextDouble();
        scanner.nextLine();
        if (name.equals(""))
            throw new EmptyStringException();
        labClass.addStudent(new Student(name, mark));
    }

    private void removeStudent() throws StudentNotFoundException {
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        labClass.deleteStudent(name);
    }

    private void showStudents() {
        System.out.println(labClass);
    }

    public void run() throws EmptyStringException, StudentNotFoundException {
        int x = 0;
        while (x != 4) {
            System.out.println("===================");
            System.out.println("1) Добавить студента");
            System.out.println("2) Убрать студента");
            System.out.println("3) Список");
            System.out.println("4) Завершить работу");
            System.out.print("Введите номер: ");
            x = scanner.nextInt();
            scanner.nextLine();
            switch (x) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    showStudents();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Неверный номер");
            }
        }
    }


}