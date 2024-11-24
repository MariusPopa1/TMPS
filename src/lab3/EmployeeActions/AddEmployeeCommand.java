package lab3.EmployeeActions;

import lab3.EmployeeTypes.Employee;

public class AddEmployeeCommand implements Command {
    private HRManager hrManager;
    private Employee employee;

    public AddEmployeeCommand(HRManager hrManager, Employee employee) {
        this.hrManager = hrManager;
        this.employee = employee;
    }

    @Override
    public void execute() {
        hrManager.addEmployee(employee);
    }
}
