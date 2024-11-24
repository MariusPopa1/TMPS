package lab3.EmployeeActions;


import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }
}

