package lab3.EmployeeAdditionalBenefits;

import lab3.EmployeeTypes.Employee;

public class EmployeeRetirementPlan extends EmployeeDecorator {
    public EmployeeRetirementPlan(Employee employee) {
        super(employee);
    }

    @Override
    public void showDetails() {
        decoratedEmployee.showDetails();
        System.out.println("Additional Benefit: Retirement Plan");
    }

}