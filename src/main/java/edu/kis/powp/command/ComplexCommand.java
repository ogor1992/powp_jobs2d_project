package edu.kis.powp.command;

import java.util.List;

public class ComplexCommand implements DriverCommand{
    private List<DriverCommand> driver;

    public ComplexCommand(List<DriverCommand> drivers) {
        this.driver = drivers;
    }

    @Override
    public void execute() {
        driver.forEach(DriverCommand::execute);
    }
}
