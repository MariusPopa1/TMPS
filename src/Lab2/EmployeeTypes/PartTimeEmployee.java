package Lab2.EmployeeTypes;


public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Part-Time Employee: " + name);
    }

    @Override
    public String getType(){ return "Part-time";}
}