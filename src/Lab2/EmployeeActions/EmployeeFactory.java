package Lab2.EmployeeActions;
import Lab2.EmployeeTypes.Employee;
import Lab2.EmployeeTypes.*;

public class EmployeeFactory {
    public static Employee createEmployee(String type, String name) {
        return switch (type) {
            case "FullTime" -> new FullTimeEmployee(name);
            case "PartTime" -> new PartTimeEmployee(name);
            default -> throw new IllegalArgumentException("Invalid employee type.");
        };
    }
}