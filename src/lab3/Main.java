package lab3;

import lab3.EmployeeActions.*;
import lab3.EmployeeTypes.*;

public class Main {
    public static void main(String[] args) {


        HRManager hrManager = HRManager.getInstance();
        Invoker invoker = new Invoker();
        Employee fullTimeEmployee = new FullTimeEmployee("Diana");
        Employee partTimeEmployee = new PartTimeEmployee("Eve");
        Command addFullTimeEmployee = new AddEmployeeCommand(hrManager, fullTimeEmployee);
        Command addPartTimeEmployee = new AddEmployeeCommand(hrManager, partTimeEmployee);
        invoker.executeCommand(addFullTimeEmployee);
        invoker.executeCommand(addPartTimeEmployee);
        hrManager.showAllEmployees();
    }
}
