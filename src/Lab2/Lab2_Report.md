# Structural Design Patterns


## Author: Popa Marius FAF-222

----

## Objectives:

* Extend your project and implement at least 3 SDPs;
* Keep the files grouped by their responsibilities;
* Keep it to one client;

## Theoretical Background:
In software engineering, the Structural Design Patterns are concerned with how classes and objects are composed to form larger structures. Structural class patterns use inheritance to create a hierarchy of classes/abstractions, but the structural object patterns use composition which is generally a more flexible alternative to inheritance.

Some examples of from this category of design patterns are:

* Adapter
* Bridge
* Composite
* Decorator
* Facade
* Flyweight
* Proxy

## Used Design Patterns:

* Decorator
* Singleton Method
* Builder


## Implementation

* Continuing on the implementation of the previous Employee Management System,
I started with adding the Decorator Pattern, which extends the Employee class and makes
use of its already existing methods.
``` java
public abstract class EmployeeDecorator extends Employee {
    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee employee) {
        super(employee.getName());
        this.decoratedEmployee = employee;
    }
    @Override
    public abstract void showDetails();
    
}
```
While similar to the builder, a decorator adds flavour  on top, which in this case are the Retirement and Health Insurance plans. Usually, the
decorator pattern would add those features dynamically, but in this case, they are shown in the code
for visibility. (the dynamic version will be implemented.)

``` java
public class EmployeeHealthInsurance extends EmployeeDecorator {
    public EmployeeHealthInsurance(Employee employee) {
        super(employee);
    }

    @Override
    public void showDetails() {
        decoratedEmployee.showDetails();
        System.out.println("Additional Benefit: Health Insurance");
    }

}
```

* Everything in my program got a little cluttered by this point, with a bunch of import statements,
new employee creations in the program, so it makes sense to implement the Facade Pattern and make
everything in the main file(the client), a little more simplified. I also added the name and type to the builder,
to make the print a little more detailed.

New main with less clutter:
``` java
EmployeeGeneration facade = new EmployeeGeneration();
        facade.createAndAddEmployee("FullTime", "Diana", null, "555-5678");
        facade.createAndAddEmployee("PartTime", "Eve", "101 Elm St", null);

        System.out.println("\nAll Employees via Facade:");
        facade.displayAllEmployees();


```

* The new EmployeeGeneration standing in for the Facade pattern is in the utilities
folder as per the requirements, including the decorator pattern for now, which, to be
honest, is a questionable practice at best.

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
* The last one I added was the Adapter pattern, which conceptually, is for the case
when, for example, this company collaborates with external employees that have a differently
declared type, and the adapter is meant to include those in the company's system. In this case,
the Employee will have an ID instead of the type

``` java
private String externalName;
    private String employeeId;

    public ExternalEmployee(String externalName, String employeeId) {
        this.externalName = externalName;
        this.employeeId = employeeId;
    }

```
* The adaption happens in the ExternalEmployeeAdapter, and is further used in the EmployeeGeneration file,
which is my Facade, and helps integrate it into the system.

``` java
private ExternalEmployee externalEmployee;

    public ExternalEmployeeAdapter(ExternalEmployee newEmployee) {
        super(newEmployee.getExternalName());
        this.externalEmployee = newEmployee;
    }

    @Override
    public void showDetails() {
        System.out.println("External Employee ID: " + externalEmployee.getEmployeeId());
        System.out.println("External Employee Name: " + getName());
    }
    
// in EmployeeGeneration aka my Facade
public void createAndAddNewEmployee(ExternalEmployee externalEmployee) {

        Employee adaptedEmployee = new ExternalEmployeeAdapter(externalEmployee);
        hrManager.addEmployee(adaptedEmployee);
        adaptedEmployee.showDetails();
```





I still have a couple of bugs with the printout,
but overall, the system works pretty well as a whole, here is the output:
``` 
Profile created: Name: Diana, Type: Part-Time, Address: null, Contact: 555-5678
Employee added: Diana
Profile created: Name: Eve, Type: Full-Time, Address: 101 Elm St, Contact: null
Employee added: Eve


Employee added: Charlie
External Employee ID: EXT-001
External Employee Name: Charlie
Full-Time Employee: Diana
Additional Benefit: Health Insurance
Additional Benefit: Retirement Plan
Part-Time Employee: Eve
Additional Benefit: Health Insurance
External Employee ID: EXT-001
External Employee Name: Charlie

All Employees via Facade:
Full-Time Employee: Diana
Additional Benefit: Health Insurance
Additional Benefit: Retirement Plan
Part-Time Employee: Eve
Additional Benefit: Health Insurance
External Employee ID: EXT-001
External Employee Name: Charlie

```
## Conclusions
The implementation of those SDPs, let to a higher understanding of both the previous project structure,
possible improvements and interesting possibilities. I had a bit of trouble understanding the difference
a bit between some of them, specifically the Builder and the Decorator, but some research made it pretty clear.
The Facade is pretty straightforward honestly, but I feel I still have room to improve with the Adapter.


