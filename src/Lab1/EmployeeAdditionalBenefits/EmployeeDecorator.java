package Lab1.EmployeeAdditionalBenefits;
import Lab1.EmployeeTypes.*;

public abstract class EmployeeDecorator extends Employee {
    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee employee) {
        super(employee.getName());
        this.decoratedEmployee = employee;
    }

    @Override
    public abstract void showDetails();
}






