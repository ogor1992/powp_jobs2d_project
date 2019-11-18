package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int X = 0, Y = 0;
    private Job2dDriver driver;

    public SetPositionCommand(int x, int y, Job2dDriver job2dDriver){
        this.X = x;
        this.Y = y;
        this.driver = job2dDriver;
    }

    @Override
    public void execute() {
        driver.setPosition(X, Y);
    }
}
