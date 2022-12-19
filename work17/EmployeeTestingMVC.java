package work17;

public class EmployeeTestingMVC {

    private static Employee getBaseEmployeeINFO() {
        Employee employee = new Employee("base base", 0);
        return employee;
    }

    public static void main(String[] args) {
        Employee model = getBaseEmployeeINFO();

        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.updateView();

        controller.setEmployeeName("Kira Podshivalova");
        controller.setEmployeeSalary(500);
        controller.updateView();
    }
}
