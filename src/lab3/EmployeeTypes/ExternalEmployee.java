package lab3.EmployeeTypes;

public class ExternalEmployee {
    private String externalName;
    private String employeeId;

    public ExternalEmployee(String externalName, String employeeId) {
        this.externalName = externalName;
        this.employeeId = employeeId;
    }

    public String getExternalName() {
        return externalName;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
