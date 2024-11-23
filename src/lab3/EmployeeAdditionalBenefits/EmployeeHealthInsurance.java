package lab3.EmployeeAdditionalBenefits;

import lab3.EmployeeTypes.Employee;

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
