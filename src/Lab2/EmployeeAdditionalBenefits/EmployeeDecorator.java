package Lab2.EmployeeAdditionalBenefits;
import Lab2.EmployeeTypes.Employee;

public abstract class EmployeeDecorator extends Employee {
    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee employee) {
        super(employee.getName());
        this.decoratedEmployee = employee;
    }
    @Override
    public abstract void showDetails();


}






