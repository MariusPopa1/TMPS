package Lab2.EmployeeActions;
import Lab2.EmployeeTypes.Employee;

import java.util.ArrayList;
import java.util.List;

public class HRManager {
    private static HRManager instance;
    private final List<Employee> employees;

    private HRManager() {
        this.employees = new ArrayList<>();
    }

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
