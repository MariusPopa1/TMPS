# Creational Design Patterns


## Author: Popa Marius FAF-222

----

## Objectives:

* Get familiar with the Creational DPs;
* Choose a specific domain;
* Implement at least 3 CDPs for the specific domain;


## Used Design Patterns:

* Factory Method
* Singleton Method
* Builder


## Implementation

* For my domain I chose an Employee Management System, with 2 types of employees, a
full-time employee, and a part-time employee, found in the EmployeeTypes folder,and both extend
the Base employee class.
``` java
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("Full-Time Employee: " + name);
    }
}
}
```


* Next I added an employee factory, which now makes creating new
employee types easier in the future and places the object creation
in a dedicated method, simplifying the process.

``` java
public class EmployeeFactory {
    public static Employee createEmployee(String type, String name) {
        return switch (type) {
            case "FullTime" -> new FullTimeEmployee(name);
            case "PartTime" -> new PartTimeEmployee(name);
            default -> throw new IllegalArgumentException("Invalid employee type.");
        };
    }
}
```

* Now we have to manage the resources, in this case, the employees, so I created a Singleton,
HRManager, which will coordinate the objects in this simple implementation.
This method contains one instance, a condition which it enforces, and then is able to add new employees and their details to its list
and show the existing employees.

``` java
public class HRManager {
    private static HRManager instance;
    private final List<Employee> employees = new ArrayList<>();

    private HRManager() {}

    public static HRManager getInstance() {
        if (instance == null) {
            instance = new HRManager();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    public void showAllEmployees() {
        employees.forEach(Employee::showDetails);
    }
}

```

* Lastly, a Builder is used to construct an EmployeeProfile class, which will take care of
the simple fields address and contactNumber now added to the employee's profile. Now optional configurable
profile options are separated in another class, and ads variation to the base class.

``` java
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
```


## Conclusions
This simple implementation of 3 CDPs led to my understanding of them, how they work, and for what purpose they are used.
Those patterns make creating an object easier, more intuitive, and help ease future modifications that
the code may need, while also hiding implementations. Overall, pretty cool topic, obviously implemented in way more difficult
ways at higher levels, but this was interesting for a base understanding.


