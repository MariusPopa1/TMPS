package lab3.EmployeeActions;
import lab3.EmployeeTypes.Employee;
import lab3.EmployeeTypes.FullTimeEmployee;
import lab3.EmployeeTypes.PartTimeEmployee;

public class EmployeeFactory {
    public static Employee createEmployee(String type, String name) {
        return switch (type) {
            case "FullTime" -> new FullTimeEmployee(name);
            case "PartTime" -> new PartTimeEmployee(name);
            default -> throw new IllegalArgumentException("Invalid employee type.");
        };
    }
}