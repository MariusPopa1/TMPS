package Lab2;
import Lab2.EmployeeTypes.Employee;
import Lab2.EmployeeAdditionalBenefits.*;
import Lab2.EmployeeTypes.ExternalEmployee;
import Lab2.Utilities.*;

public class Main {
    public static void main(String[] args) {

        // Moved everything into the factory
        EmployeeGeneration facade = new EmployeeGeneration();
        facade.createAndAddEmployee("FullTime", "Diana", null, "555-5678");
        facade.createAndAddEmployee("PartTime", "Eve", "101 Elm St", null);
        System.out.println();
        ExternalEmployee externalEmployee = new ExternalEmployee("Charlie", "EXT-001");

        System.out.println();
        facade.createAndAddNewEmployee(externalEmployee);
        facade.displayAllEmployees();
        System.out.println("\nAll Employees via Facade:");
        facade.displayAllEmployees();




    }
}
