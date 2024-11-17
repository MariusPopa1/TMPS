package Lab2.EmployeeTypes;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Full-Time Employee: " + name);
    }

    @Override

    public String getType(){ return "FullTime";}
}