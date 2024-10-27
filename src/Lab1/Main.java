package Lab1;
import Lab1.EmployeeActions.*;
import Lab1.EmployeeTypes.*;

public class Main {
    public static void main(String[] args) {
        // Create Employees using Factory Method
        Employee emp1 = EmployeeFactory.createEmployee("FullTime", "Alice");
        Employee emp2 = EmployeeFactory.createEmployee("PartTime", "Bob");

        // Create Employee Profiles using Builder
        EmployeeProfile profile1 = new EmployeeProfile.Builder()
                .address("123 Maple St")
                .contactNumber("555-1234")
                .build();

        EmployeeProfile profile2 = new EmployeeProfile.Builder()
                .address("456 Oak St")
                .build();

        System.out.println("Profile 1: " + profile1);
        System.out.println("Profile 2: " + profile2);

        // Manage Employees with Singleton
        HRManager hrManager = HRManager.getInstance();
        hrManager.addEmployee(emp1);
        hrManager.addEmployee(emp2);

        System.out.println("\nAll Employees:");
        hrManager.showAllEmployees();
    }
}
