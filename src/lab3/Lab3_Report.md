# Structural Design Patterns


## Author: Popa Marius FAF-222

----

## Objectives:

* Study and understand the Behavioral Design Patterns.
* As a continuation of the previous laboratory work, think about what communication between software entities might be involed in your system.
* Implement some additional functionalities using behavioral design patterns.

## Theoretical Background:
In software engineering, behavioral design patterns have the purpose of identifying common communication patterns between different software entities. By doing so, these patterns increase flexibility in carrying out this communication.

Some examples from this category of design patterns are :

Chain of Responsibility
Command
Interpreter
Iterator
Mediator
Observer
Strategy

## Used Behavioral Pattern:

* Command


## Implementation

* Continuing on the implementation of the previous Employee Management System,
I started with adding the Command class, which is like a starting point for all
command classes, but keeps them separated from the invoker, not providing it any
more data than it really needs.
``` java
public interface Command {
    void execute();
}
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

* The next class, AddEmployeeCommand actually adds the employees, my making an instance
of HR manager, I suppose it also helps with hiding the execution of the program from
the client and keeping everything abstract. We can theoretically make each action
into a command action.

``` java
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

```

* Invoker - the thing that actually triggers the commands, executing them, having
a commandHistory that we can set up to view logs in case we need to, and it overall 
separates the execution logic from the client code(main), adding to the point
I made earlier

``` java
public class EmployeeInvoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }
}
```


The execution print stays pretty similar.
``` 
Employee added: Diana
Employee added: Eve
Full-Time Employee: Diana
Part-Time Employee: Eve
```
## Conclusions
This is honestly really similar to the Facade pattern, but I guess it's main point is not hiding the execution, but rather
to make every request an object to later maybe handle it, either by ignoring it, executing it, deleting it or just keeping logs.
The abstraction part is just a side effect. Also, implementing this was time sensitive for me, so I did sacrifice the Facade pattern
to have this in time.



