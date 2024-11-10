package Lab1.EmployeeAdditionalBenefits;
import Lab1.EmployeeTypes.*;

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