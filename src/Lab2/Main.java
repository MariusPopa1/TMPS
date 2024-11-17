package Lab2;
import Lab2.EmployeeActions.EmployeeFactory;
import Lab2.EmployeeActions.EmployeeProfile;
import Lab2.EmployeeActions.HRManager;
import Lab2.EmployeeTypes.Employee;

public class Main {
    public static void main(String[] args) {
        // Factory Use, simplifying object creation.
        Employee emp1 = EmployeeFactory.createEmployee("FullTime", "Alice");
        Employee emp2 = EmployeeFactory.createEmployee("PartTime", "Bob");

        // Builder use, adding more complex details that can be later modified if need be, extending the ones from Factory
        EmployeeProfile profile1 = new EmployeeProfile.Builder()
                .getEmployeeDetails(emp1)
                .address("123 Maple St")
                .contactNumber("555-1234")
                .build();

        EmployeeProfile profile2 = new EmployeeProfile.Builder()
                .getEmployeeDetails(emp2)
                .address("456 Oak St")
                .build();

        System.out.println("Profile 1: " + profile1);
        System.out.println("Profile 2: " + profile2);


        // Singleton use, if we tried to make another instance it would return the same instance
        HRManager hrManager = HRManager.getInstance();
        hrManager.addEmployee(emp1);
        hrManager.addEmployee(emp2);

        System.out.println("\nAll Employees:");
        hrManager.showAllEmployees();
    }
}
