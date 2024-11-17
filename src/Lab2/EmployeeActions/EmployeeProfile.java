package Lab2.EmployeeActions;
import Lab2.EmployeeTypes.Employee;
public class EmployeeProfile {
    private final String address;
    private final String contactNumber;
    private final String name;
    private final String type;

    private EmployeeProfile(Builder builder) {
        this.address = builder.address;
        this.contactNumber = builder.contactNumber;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static class Builder {
        private String address;
        private String contactNumber;
        private String name;
        private String type;

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder contactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder getEmployeeDetails(Employee employee){
            this.name = employee.getName();
            this.type = employee.getType();
            return this;
        }

        public EmployeeProfile build() {
            return new EmployeeProfile(this);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Address: " + address + ", Contact: " + contactNumber;
    }
}

