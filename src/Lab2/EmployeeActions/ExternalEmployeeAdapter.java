package Lab2.EmployeeActions;

import Lab2.EmployeeTypes.Employee;
import Lab2.EmployeeTypes.ExternalEmployee;

public class ExternalEmployeeAdapter extends Employee {
    private ExternalEmployee externalEmployee;

    public ExternalEmployeeAdapter(ExternalEmployee newEmployee) {
        super(newEmployee.getExternalName());
        this.externalEmployee = newEmployee;
    }

    @Override
    public void showDetails() {
        System.out.println("External Employee ID: " + externalEmployee.getEmployeeId());
        System.out.println("External Employee Name: " + getName());
    }
}