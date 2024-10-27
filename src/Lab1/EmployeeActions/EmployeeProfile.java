package Lab1.EmployeeActions;

public class EmployeeProfile {
    private final String address;
    private final String contactNumber;

    private EmployeeProfile(Builder builder) {
        this.address = builder.address;
        this.contactNumber = builder.contactNumber;
    }

    public static class Builder {
        private String address;
        private String contactNumber;

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder contactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public EmployeeProfile build() {
            return new EmployeeProfile(this);
        }
    }

    @Override
    public String toString() {
        return "Address: " + address + ", Contact: " + contactNumber;
    }
}

