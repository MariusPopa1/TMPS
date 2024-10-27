package Lab1.EmployeeActions;
import Lab1.EmployeeTypes.*;
import java.util.ArrayList;
import java.util.List;

public class HRManager {
    private static HRManager instance;
    private final List<Employee> employees = new ArrayList<>();

    private HRManager() {}

    public static HRManager getInstance() {
        if (instance == null) {
            instance = new HRManager();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    public void showAllEmployees() {
        employees.forEach(Employee::showDetails);
    }
}
