package Lab1;
import Lab1.EmployeeActions.*;

import Lab1.EmployeeTypes.*;

public class Main {
    public static void main(String[] args) {
        // Factory Use, simplifying object creation.
        Employee emp1 = EmployeeFactory.createEmployee("FullTime", "Alice");
        Employee emp2 = EmployeeFactory.createEmployee("PartTime", "Bob");


        EmployeeProfile profile1 = new EmployeeProfile.Builder()
                .address("123 Maple St")
                .contactNumber("555-1234")
                .build();

        EmployeeProfile profile2 = new EmployeeProfile.Builder()
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
