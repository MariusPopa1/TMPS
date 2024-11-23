package lab3.Utilities;

import lab3.EmployeeActions.EmployeeFactory;
import lab3.EmployeeActions.ExternalEmployeeAdapter;
import lab3.EmployeeActions.HRManager;
import lab3.EmployeeAdditionalBenefits.EmployeeHealthInsurance;
import lab3.EmployeeAdditionalBenefits.EmployeeRetirementPlan;
import lab3.EmployeeTypes.Employee;
import lab3.EmployeeTypes.ExternalEmployee;

public class EmployeeGeneration {
    private final HRManager hrManager = HRManager.getInstance();

    public Employee createAndAddEmployee(String type, String name, String address, String contact) {
        Employee employee = EmployeeFactory.createEmployee(type, name);

        if ("FullTime".equals(type)) {
            employee = new EmployeeHealthInsurance(employee);
            employee = new EmployeeRetirementPlan(employee);
        } else if ("PartTime".equals(type)) {
            employee = new EmployeeHealthInsurance(employee);
        }

        EmployeeProfile profile = new EmployeeProfile.Builder()
                .address(address)
                .contactNumber(contact)
                .getEmployeeDetails(employee)
                .build();

        System.out.println("Profile created: " + profile);
        hrManager.addEmployee(employee);
        return employee;
    }
    public void createAndAddNewEmployee(ExternalEmployee externalEmployee) {

        Employee adaptedEmployee = new ExternalEmployeeAdapter(externalEmployee);
        hrManager.addEmployee(adaptedEmployee);
        adaptedEmployee.showDetails();
    }

    public void displayAllEmployees() {
        hrManager.showAllEmployees();
    }
}

