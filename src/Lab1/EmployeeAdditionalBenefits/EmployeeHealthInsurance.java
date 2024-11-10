package Lab1.EmployeeAdditionalBenefits;

import Lab1.EmployeeTypes.Employee;

public class EmployeeHealthInsurance extends EmployeeDecorator {
    public EmployeeHealthInsurance(Employee employee) {
        super(employee);
    }

    @Override
    public void showDetails() {
        decoratedEmployee.showDetails();
        System.out.println("Additional Benefit: Health Insurance");
    }
}
