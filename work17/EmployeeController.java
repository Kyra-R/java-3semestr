package work17;

public class EmployeeController {
    private Employee person;
    private EmployeeView view;
    public EmployeeController(Employee person, EmployeeView view) {
        this.person = person;
        this.view = view;
    }
    public void setEmployeeName(String name) {
        person.setName(name);
    }
    public String getEmployeeName() {
        return person.getName();
    }

    public void setEmployeeSalary(int salary) {
        person.setSalary(salary);
    }
    public int getEmployeeSalary() {
        return person.getSalary();
    }
    public void updateView() {
        view.infoEmployee(person.getName(), person.getSalary());
    }
}